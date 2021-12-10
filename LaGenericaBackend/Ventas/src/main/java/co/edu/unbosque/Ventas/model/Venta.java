package co.edu.unbosque.Ventas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "db_ventas")
public class Venta {
	@Id
	 private Integer consecutivo;
	private Integer cedula_cliente;
	private String nombre_cliente;
	private detalle_venta[] producto;
	private Double total_venta;
	private Double total_iva;
	private Double total_con_iva;
	
	
	
	public Integer getConsecutivo() {
		return consecutivo;
	}
	public void setConsecutivo(Integer consecutivo) {
		this.consecutivo = consecutivo;
	}
	public Integer getCedula_cliente() {
		return cedula_cliente;
	}
	public void setCedula_cliente(Integer cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}
	public Double getTotal_venta() {
		return total_venta;
	}
	public void setTotal_venta(Double total_venta) {
		this.total_venta = total_venta;
	}
	public Double getTotal_iva() {
		return total_iva;
	}
	public void setTotal_iva(Double total_iva) {
		this.total_iva = total_iva;
	}
	public Double getTotal_con_iva() {
		return total_con_iva;
	}
	public void setTotal_con_iva(Double total_con_iva) {
		this.total_con_iva = total_con_iva;
	}
	public detalle_venta[] getProducto() {
		return producto;
	}
	public void setProducto(detalle_venta[] producto) {
		this.producto = producto;
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	
	
}
