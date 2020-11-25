package supermercadoApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import java.util.Collections;

public class Supermercado {

	
	
	
	
	ArrayList<Producto> lista_mercaderia = new ArrayList<Producto> ();
	
	
	public void mostrarProductos() {
		
		//recorro el arraylist con el interador
		
		Iterator<Producto> it =  lista_mercaderia.iterator();
	
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		
		// imprimo la linea de separación
		for(int i=0; i <64; i++) {
			System.out.print("=");
			
		}
		
		//imprimo el salto de linea
		System.out.println("");
	}
	
	
	public void ingresarMercaderia(Producto producto){
		
		lista_mercaderia.add(producto);
	}
	
	
	public void productoMasCaro() {
		
		Collections.sort(lista_mercaderia);
		
		
		
		// como esta ordenado de mayor a menor, llamo al metodo get y uso el primer indice
		
		System.out.println("Producto más caro: " + lista_mercaderia.get(0).getNombre()) ;
	}
	

	public void productoMasBarato() {
		
		// Collections.sort funciona si implemento la interfaz Comparable en la clase a ordenar
		Collections.sort(lista_mercaderia);
		
	
		// como esta ordenado de mayor a menor, llamo al metodo get y uso el ultimo indice
		
		System.out.println("Producto más barato: " + lista_mercaderia.get(lista_mercaderia.size() -1).getNombre() );
	}
	
	
	
	
	
	




}
