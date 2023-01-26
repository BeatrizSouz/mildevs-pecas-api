package br.com.mildevs.mildevspecaapi.Repository;




import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import br.com.mildevs.mildevspecaapi.Entity.Categoria;
import br.com.mildevs.mildevspecaapi.Entity.Peca;



@Repository
public interface RepositoryPeca extends CrudRepository<Peca, Long>{
	
	Optional <Peca> findBycodBarra(Long codBarras);
	List <Peca> findAll();
	List<Peca>findBycategoria(Categoria categoria);
	List<Peca>findBymodeloCarro(String modeloCarro);

	

	
	

}
