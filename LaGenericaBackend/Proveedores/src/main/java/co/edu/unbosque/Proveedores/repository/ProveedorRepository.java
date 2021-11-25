package co.edu.unbosque.Proveedores.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.Proveedores.model.Proveedor;

public interface ProveedorRepository extends MongoRepository<Proveedor, Integer>{
	
}
