package br.com.mildevs.mildevspecaapi.Repository;




import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.mildevs.mildevspecaapi.Entity.Categoria;
import br.com.mildevs.mildevspecaapi.Entity.Peca;



@Repository
public interface RepositoryPeca extends CrudRepository<Peca, Long>{
	
	List <Peca> findBymodeloCarro (String modeloCarro);
	
	List <Peca> findBycategoria (Categoria categoria);
	

	

	
	

}
