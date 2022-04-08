package Producto;

import java.math.BigDecimal;

import Enum.Tax;

public class Product implements Comparable<Product>{
	String nombre;
	BigDecimal precio;
	Tax tax;
	
	public Product() {
		super();
	}
	
	public Product(String nombre, BigDecimal precio, Tax tax) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.tax = tax;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public Tax getTax() {
		return tax;
	}
	public void setTax(Tax tax) {
		this.tax = tax;
	}
	
	@Override
	public int compareTo(Product o) {
		int ordenado=this.nombre.compareTo(o.getNombre());
		return ordenado;
	}
	

}
