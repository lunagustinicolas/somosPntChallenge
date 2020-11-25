package supermercadoApp;

import java.util.ArrayList;

public class PrincipalApp {

	public static void main(String[] args) {
		
		
		// Instancio un objeto de la clase supermercado
		
		Supermercado mercadito = new Supermercado();
		
		// ingreso los productos al supermercado
		
		mercadito.ingresarMercaderia(new Bebida("Coca-Cola Zero", 20, 1.5 ));
	
		mercadito.ingresarMercaderia(new Bebida("Coca-Cola", 18, 1.5 ));
		
		mercadito.ingresarMercaderia(new Cosmetico("Shampoo Sedal", 19, "500ml" ));
		
		mercadito.ingresarMercaderia(new Fruta("Frutillas", 64, "kilo" ));
		
		
		//Utilizo los metodos para mostrar en pantalla la informacion solicitada
		
		mercadito.mostrarProductos();
		
		mercadito.productoMasCaro();
		
		mercadito.productoMasBarato();
		
		
		
		
		
	
	}

	
}
