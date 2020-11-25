package supermercadoApp;

public class Producto implements Comparable<Producto> {

	
	private String nombre;
	
	private int precio;
	
	
	

	
	public Producto(String nombre, int precio) {
		
		this.nombre= nombre;
		
		this.precio = precio;
		
	}
	
	public int getPrecio() {
		
		return this.precio;
	}
	
	public String getNombre() {
		
		return this.nombre;
	}
	


	@Override
	public int compareTo(Producto producto) {
		
		//asi obtengo el orden de mayor a menor
		
		return   producto.getPrecio() -  this.getPrecio();
	
	

}

}