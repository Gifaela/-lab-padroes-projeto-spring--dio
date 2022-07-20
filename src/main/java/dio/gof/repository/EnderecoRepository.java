package dio.gof.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dio.gof.model.Endereco;

// CrudRepository é uma Strategy -> é uma interface que me obriga a seguir a estratégia de implementação]

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
