package co.edu.unbosque.Clientes.controller;

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

import co.edu.unbosque.Clientes.model.Cliente;
import co.edu.unbosque.Clientes.repository.ClienteRepository;

@CrossOrigin
@RestController
@RequestMapping("Cliente")

	public class ClienteController {
	
	@Autowired
	 private ClienteRepository clienteRepo;
	
	@GetMapping("/Obtener")
	public List<Cliente> listar(){
	return clienteRepo.findAll();
	}

	@GetMapping("/Buscar/{id}")
	public Cliente Buscar(@PathVariable(value="id") Integer id){
		Cliente cliente=new Cliente();
		try {cliente=clienteRepo.findById(id).get();}
		catch(Exception e) {}
	return cliente;
	}

	 @PostMapping("/Crear")
		public void Crear(@RequestBody Cliente cliente) {
			clienteRepo.save(cliente);
		}

	  @PutMapping("/Actualizar")
	  public void actualizar(@RequestBody Cliente cliente) {
			clienteRepo.save(cliente);
	  }

		@DeleteMapping("/Borrar/{id}")
		public void Borrar(@PathVariable(value="id") Integer id) {		
			clienteRepo.deleteById(id);
	 }
	}

