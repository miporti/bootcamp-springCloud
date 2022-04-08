package Taller2;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

import Enum.Tax;
import Producto.Product;

public class Aplicacion {
	
	private static BigDecimal precioTotal = new BigDecimal("0");
	private static BigDecimal precioIva = new BigDecimal("0");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> shoppingCart = List.of(
				new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
				new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
				new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
				new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
				new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
				new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));

		
		
		//Calcular coste total de la compra, incluyendo impuestos
		
		shoppingCart.stream().forEach(pro -> {
			precioIva = pro.getPrecio().multiply(pro.getTax().getPrecio());
			precioTotal = precioTotal.add(pro.getPrecio().add(precioIva));
		});
		
		System.out.println("Total con impuestos: " + precioTotal);
		
		Stream<Product> producto=shoppingCart.stream().filter(productos -> productos.getNombre().startsWith("C")).sorted();
		
		System.out.print("La lista oredenada es: ");
		producto.forEach(productos -> System.out.print(productos.getNombre() + ", " ));
		

	}
}