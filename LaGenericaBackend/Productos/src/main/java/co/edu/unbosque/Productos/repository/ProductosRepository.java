package co.edu.unbosque.Productos.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.Productos.model.Productos;

public interface ProductosRepository extends MongoRepository<Productos,Integer>{

}
