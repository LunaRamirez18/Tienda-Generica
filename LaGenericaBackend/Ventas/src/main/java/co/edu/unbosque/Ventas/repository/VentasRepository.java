package co.edu.unbosque.Ventas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.Ventas.model.Venta;



public interface VentasRepository extends MongoRepository<Venta, Integer> {

}
