package co.edu.unbosque.Clientes.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.Clientes.model.Cliente;



public interface ClienteRepository extends MongoRepository<Cliente, Integer> {

}
