package co.edu.unbosque.Proveedores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.Proveedores.model.Proveedor;
import co.edu.unbosque.Proveedores.repository.ProveedorRepository;

@CrossOrigin
@RestController
@RequestMapping("Proveedor")
public class ProveedorController {

	@Autowired
	private ProveedorRepository proveedorRepo;
	
	@GetMapping("/Obtener")
	public List<Proveedor> listar(){
		return proveedorRepo.findAll();
		}
	
	@GetMapping("/Buscar/{id}")
	public Proveedor Buscar(@PathVariable(value="id") Integer id){
		Proveedor proveedor=new Proveedor();
		try {proveedor=proveedorRepo.findById(id).get();}
		catch(Exception e) {}
	return proveedor;
	}
	@PostMapping("/Crear")
	public void Crear(@RequestBody Proveedor proveedor) {
		proveedorRepo.save(proveedor);
	}
	 @PutMapping("/Actualizar")
	 public void Actualizar(@RequestBody Proveedor proveedor) {
			proveedorRepo.save(proveedor);
	  }
    @DeleteMapping("/Borrar/{id}")
	public void Borrar(@PathVariable(value="id") Integer id) {		
		proveedorRepo.deleteById(id);
 }
}
