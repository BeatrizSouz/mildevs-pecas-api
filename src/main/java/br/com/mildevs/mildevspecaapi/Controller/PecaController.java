package br.com.mildevs.mildevspecaapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mildevs.mildevspecaapi.Entity.Categoria;
import br.com.mildevs.mildevspecaapi.Entity.Peca;
import br.com.mildevs.mildevspecaapi.Exception.ErroNegocioException;
import br.com.mildevs.mildevspecaapi.Service.PecaService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/pecas")
public class PecaController {
	
	@Autowired
	PecaService pecaService ;
	
	//@ResponseStatus(code = HttpStatus.CREATED)	
	@PostMapping
	public boolean inserirNovaPeca(@Valid @RequestBody  Peca peca) throws ErroNegocioException {
		return this.pecaService.inserirNovaPeca(peca);
	}

	@PutMapping(path = "/{codBarra}/atualizar-dados", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Peca AtualizaPeca( @PathVariable Long codBarra , @RequestBody  Peca peca) {
		return this.pecaService.AtualizaPeca(peca);
		
	}
	
	@GetMapping(produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<Peca> listaPecas (){
		return pecaService.listaPecas();
	}
	
	@GetMapping(path = "/{codBarra}/pesquisa-peca", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Peca buscarPeca (@PathVariable Long  codBarra) {
		return this.pecaService.buscarPeca(codBarra);
	}
	
	@GetMapping(path = "/{modeloCarro}/modelo", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Peca> buscarPecaPorModelo ( @PathVariable String modeloCarro ) {
		return this.pecaService.buscarPecaPorModelo(modeloCarro);
		
	}
	

	//GET /Pecas/{categoria}/categoria
	//- listar todas as peças de uma determinada categoria;
	
	@GetMapping(path = "/{categoria}/categoria", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Peca> buscarPecaPorModelo ( @PathVariable Categoria categoria ) {
		return this.pecaService.buscarPecaPorCategoria(categoria);
		
	}
	
	/*@GetMapping(path = "/{nomePeca}/nome", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Peca> buscarPecaPorModelo1 ( @PathVariable String nome ) {
		return this.pecaService.buscar(nome);
		
	}*/
	
	@DeleteMapping(path = "/{codBarra}/remover-peca", produces = {MediaType.APPLICATION_JSON_VALUE})
	public boolean removePeca (@PathVariable Long codBarra ) {
		return this.pecaService.removePeca(codBarra);
	}
	
	
	
	
	
}
