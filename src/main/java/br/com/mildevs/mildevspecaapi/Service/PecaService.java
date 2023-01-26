package br.com.mildevs.mildevspecaapi.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mildevs.mildevspecaapi.DTO.AtualizaPecaDTO;
import br.com.mildevs.mildevspecaapi.DTO.CriarPecaDTO;
import br.com.mildevs.mildevspecaapi.DTO.RetornaPecaDTO;
import br.com.mildevs.mildevspecaapi.Entity.Categoria;
import br.com.mildevs.mildevspecaapi.Entity.Peca;
import br.com.mildevs.mildevspecaapi.Exception.ErroNegocioException;
import br.com.mildevs.mildevspecaapi.Repository.RepositoryPeca;

@Service
public class PecaService {
	
	@Autowired
	RepositoryPeca repoPeca;
	
	//criar 
	
	public boolean inserirNovaPeca(CriarPecaDTO pecaDto) {
		this.repoPeca.save(pecaDto.toEntity());
		return true;
	}
	
	public RetornaPecaDTO AtualizaPeca(AtualizaPecaDTO atualizarPeca, Long  codBarra)throws ErroNegocioException  {
		Optional<Peca> pecaPesquisada = repoPeca.findBycodBarra(codBarra);
		if (pecaPesquisada.isEmpty()) {
			throw new ErroNegocioException("Não existe nenhuma peça com esse código!");
		}
		
		pecaPesquisada.get().setPrecoCusto(atualizarPeca.getPrecoCusto());
		pecaPesquisada.get().setPrecoVenda(atualizarPeca.getPrecoVenda());
		pecaPesquisada.get().setQuantEstoque(atualizarPeca.getQuantEstoque());
		this.repoPeca.save(pecaPesquisada.get());
		
		RetornaPecaDTO pecaDto = new RetornaPecaDTO();
		BeanUtils.copyProperties(pecaPesquisada.get(), pecaDto);
		return pecaDto;
	}
	
	public List<RetornaPecaDTO> listaPecas (){
		List<Peca> pecas = repoPeca.findAll();
		List<RetornaPecaDTO> retornaPecasDto = new ArrayList<>();
		
		for(Peca peca : pecas) {
			RetornaPecaDTO pecaDto = new RetornaPecaDTO();
			BeanUtils.copyProperties(peca, pecaDto);
			retornaPecasDto.add(pecaDto);
			
		}
	
		return retornaPecasDto;
	}
	
	
	public Optional<RetornaPecaDTO> buscarPeca (Long  codBarra) {
		Optional<RetornaPecaDTO> pecaDto = Optional.of(new RetornaPecaDTO());
		Optional<Peca> peca = repoPeca.findBycodBarra(codBarra);
		BeanUtils.copyProperties(peca.get(), pecaDto.get());
		
		return pecaDto;
	}
	
	
	
	public boolean removePeca (Long codBarra ) {
		this.repoPeca.deleteById(codBarra);
		return true;
	}

	public List<RetornaPecaDTO> buscarPecaPorModelo(String modelo) throws ErroNegocioException  {
		
		List<RetornaPecaDTO> retornaPecasDto = new ArrayList<>();
		List<Peca> pecasPorModelo = repoPeca.findBymodeloCarro(modelo);
		
		if (repoPeca.findBymodeloCarro(modelo).isEmpty()) {
			
			throw new ErroNegocioException("Não existe nenhuma peça com esse modelo!");
		}
		
		for(Peca peca : pecasPorModelo) {
			RetornaPecaDTO pecaDto = new RetornaPecaDTO();
			BeanUtils.copyProperties(peca, pecaDto);
			retornaPecasDto.add(pecaDto);
			
		}
	
		return retornaPecasDto;
	
	}

	public List<RetornaPecaDTO> buscarPecaPorCategoria(Categoria categoria) throws ErroNegocioException  {
		List<RetornaPecaDTO> retornaPecasDto = new ArrayList<>();
		List<Peca> pecas = repoPeca.findBycategoria(categoria);
		
		if (repoPeca.findBycategoria(categoria).isEmpty()) {
			
			throw new ErroNegocioException("Não existe nenhuma peça com essa categoria!");
		}
		
		
		for(Peca peca : pecas) {
			RetornaPecaDTO pecaDto = new RetornaPecaDTO();
			BeanUtils.copyProperties(peca, pecaDto);
			retornaPecasDto.add(pecaDto);
			
		}
	
		return retornaPecasDto;
		

	}
	
	
		
		
	

}
