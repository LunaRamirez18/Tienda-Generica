package co.edu.unbosque.Ventas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import co.edu.unbosque.Ventas.model.Venta;
import co.edu.unbosque.Ventas.repository.VentasRepository;

@RestController
@CrossOrigin
@RequestMapping("ventas")
public class VentasController {

	@Autowired
	private VentasRepository ventasDAO;
	@PostMapping("/guardar")
	public void guardar(@RequestBody Venta venta) {
		ventasDAO.save(venta);
	}
	
	@GetMapping("/buscarporconsecutivo")
	public Integer buscarporID(Integer id){
		Venta venta=new Venta();
		id=1;
		try {
			venta=ventasDAO.findById(id).get();
			while(venta.getNombre_cliente()!="") {
				id++;
				venta=ventasDAO.findById(id).get();
			}
				}
		catch(Exception e) {}
	return id;
	}
	
	@GetMapping("/listar")
	public List<Venta> listar(){
	return ventasDAO.findAll();
	}
	
	
}
