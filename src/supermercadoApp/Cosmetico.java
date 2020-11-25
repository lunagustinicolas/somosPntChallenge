package supermercadoApp;

public class Cosmetico extends Producto {
	
	private String contenido;
	
	public Cosmetico(String nombre, int precio, String contenido) {
		
		super(nombre,precio);
		
		this.contenido = contenido;
		
	}
	
	
	public String getContenido() {
		
		return this.contenido;
	}
	@Override
	public String toString() {
		
		return "Nombre: " +  getNombre() + " /// Contenido: " + getContenido() + " /// Precio:  $" + getPrecio() ;
	}
}
