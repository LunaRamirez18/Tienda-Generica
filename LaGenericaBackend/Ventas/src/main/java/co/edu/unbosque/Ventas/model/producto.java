package co.edu.unbosque.Ventas.model;

public class producto {
	private Integer codigo_producto;
	private Integer cantidad_producto;
	private Double valor_venta;
	private Double valoriva;
	private Double valor_total;
	
	public Integer getCantidad_producto() {
		return cantidad_producto;
	}
	public void setCantidad_producto(Integer cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}
	public Integer getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(Integer codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public Double getValor_total() {
		return valor_total;
	}
	public void setValor_total(Double valor_total) {
		this.valor_total = valor_total;
	}
	public Double getValor_venta() {
		return valor_venta;
	}
	public void setValor_venta(Double valor_venta) {
		this.valor_venta = valor_venta;
	}
	public Double getValoriva() {
		return valoriva;
	}
	public void setValoriva(Double valoriva) {
		this.valoriva = valoriva;
	}
	
}
