package supermercadoApp;

public class Bebida  extends Producto{
	
	private double litros ;
	
	public Bebida(String nombre, int precio, double litros) {
		
		super(nombre,precio);
		
		this.litros = litros;
		
	}
	
	public void sdqw() {
		
	}
	



	
	public double getLitros () {
		
		return this.litros;
	}
	
	@Override
	public String toString() {
		
		return "Nombre: " + getNombre() +" /// Litros: " + getLitros() + " /// Precio:  $" + getPrecio()  ;
	}
	
}
 