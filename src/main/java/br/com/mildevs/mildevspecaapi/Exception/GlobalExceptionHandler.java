package br.com.mildevs.mildevspecaapi.Exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.mildevs.mildevspecaapi.DTO.ResponseDto;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	private static final int POSICAO_ERRO = 0;
	
	@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
	@ExceptionHandler({ErroNegocioException.class})
	public @ResponseBody ResponseDto handleBusinessErrors(Exception e) {
		return new ResponseDto(e.getMessage());
	}
	
	
}
