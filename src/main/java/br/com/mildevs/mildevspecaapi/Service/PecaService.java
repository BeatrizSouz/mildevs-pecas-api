package br.com.mildevs.mildevspecaapi.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mildevs.mildevspecaapi.Entity.Categoria;
import br.com.mildevs.mildevspecaapi.Entity.Peca;
import br.com.mildevs.mildevspecaapi.Exception.ErroNegocioException;
import br.com.mildevs.mildevspecaapi.Repository.RepositoryPeca;

@Service
public class PecaService {
	
	@Autowired
	RepositoryPeca repoPeca;
	
	//criar 
	
	public boolean inserirNovaPeca(Peca Peca) throws ErroNegocioException {
		
		if(repoPeca.existsById(Peca.getCodBarra())){
			
			throw new ErroNegocioException("Já existe uma Peca com esse código!") ;
			
		}
		this.repoPeca.save(Peca);
		return true;
	}
	
	public Peca AtualizaPeca(Peca Peca) {
		if(!repoPeca.existsById(Peca.getCodBarra())){
			
			return null;
		}
		
		this.repoPeca.save(Peca);
		return Peca;
	}
	
	public List<Peca> listaPecas (){
		return (List<Peca>)repoPeca.findAll();
	}
	
	public Peca buscarPeca (Long  codBarra) {
		Optional<Peca> Peca = repoPeca.findById(codBarra);
		
		if(Peca.isPresent()) {
			
		
		}
		
		
		return Peca.get();
	}
	
	
	
	public boolean removePeca (Long codBarra ) {
		
		if(!repoPeca.existsById(codBarra)) {
			return false;
		}
		
		this.repoPeca.deleteById(codBarra);
		return true;
	}

	public List<Peca> buscarPecaPorModelo(String modelo) {
		List<Peca> buscaModelo;
		return buscaModelo = repoPeca.findBymodeloCarro(modelo);
		
		
	
	}

	public List<Peca> buscarPecaPorCategoria(Categoria categoria) {
		List<Peca> buscaCategoria;
		return buscaCategoria = repoPeca.findBycategoria(categoria);
	}
	
	
		
		
	

}
