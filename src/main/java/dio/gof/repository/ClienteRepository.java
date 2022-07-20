package dio.gof.repository;

import org.springframework.stereotype.Repository;

import dio.gof.model.Cliente;

import org.springframework.data.repository.CrudRepository;
// CrudRepository é uma Strategy -> é uma interface que me obriga a seguir a estratégia de implementação
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
