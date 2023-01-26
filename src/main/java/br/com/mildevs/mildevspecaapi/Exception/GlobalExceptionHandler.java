package br.com.mildevs.mildevspecaapi.Exception;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import br.com.mildevs.mildevspecaapi.DTO.ErroValidacaoResponseDTO;
import br.com.mildevs.mildevspecaapi.DTO.ResponseDto;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	private static final int POSICAO_ERRO = 0;
	
	@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
	@ExceptionHandler({ErroNegocioException.class})
	public @ResponseBody ResponseDto handleBusinessErrors(Exception e) {
		return new ResponseDto(e.getMessage());
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler({org.springframework.http.converter.HttpMessageNotReadableException.class})
	public @ResponseBody ResponseDto httpMessageNotReadableException(org.springframework.http.converter.HttpMessageNotReadableException e){
		 return new ResponseDto("Não foi possivel ler o campo, preencha corretamente e tente novamente");
		 
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler({MethodArgumentNotValidException.class})
	public @ResponseBody List <ErroValidacaoResponseDTO> handleMethodArgumentNotValid(MethodArgumentNotValidException e){
		List <ErroValidacaoResponseDTO> retornaMensagem = new ArrayList <ErroValidacaoResponseDTO>();
		
		for (ObjectError erro : e.getBindingResult().getAllErrors()) {
			String erroCompleto = erro.getCodes()[POSICAO_ERRO];
			String nomeCampo = erroCompleto.substring(erroCompleto.lastIndexOf(".") + 1, erroCompleto.length());
			retornaMensagem.add(new ErroValidacaoResponseDTO(nomeCampo,erro.getDefaultMessage())  );
			
			
		}
		
		return retornaMensagem;
		
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler({MethodArgumentTypeMismatchException.class})
	public @ResponseBody ResponseDto MethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException e){
		 return new ResponseDto("Escreva a consulta corretamente e tente novamente");
		 
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({TransactionSystemException.class})
	public @ResponseBody ResponseDto notFound(TransactionSystemException e) {
		
		return new ResponseDto("O processo não foi realizado, certifique-se de que todos os campos foram preenchidos corretamente.");
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({InvalidDataAccessApiUsageException.class})
	public @ResponseBody ResponseDto jpaSystemException(InvalidDataAccessApiUsageException e) {
		return new ResponseDto("É preciso inserir um código de barras válido");
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({NoSuchElementException.class})
	public @ResponseBody ResponseDto jNoSuchElementException(NoSuchElementException e) {
		return new ResponseDto("Nenhum elemento foi encontrado, tente novamente");
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(EmptyResultDataAccessException.class)
	protected @ResponseBody ResponseDto emptyResultDataAccessException(EmptyResultDataAccessException ex) {
		String erro = ex.getMessage();
		return new ResponseDto("Não existe nenhuma peça com o id" + erro.substring(65, erro.lastIndexOf(" ")));
	
	}
	



	
	
	
	
}

// Para pegar o erro e o nome dos campos:
//String erroCompleto = erro.getCodes()[POSICAO_ERRO];
//String nomeCampo = erroCompleto.substring(erroCompleto.lastIndexOf(".") + 1, erroCompleto.length());
