
public class Entrenador extends Persona {

	
	private int idfederacion;
	
	
	
	

	public int getIdfederacion() {
		return idfederacion;
	}

	public void setIdfederacion(int idfederacion) {
		this.idfederacion = idfederacion;
	}

	
	public void dirigirpartido() {
		
		
		
	}
	
	public void dirigirentrenamiento() {
		
		
	}
	
	
	public void viajarentrenador() {
		
		System.out.println( super.viajar() + " Entrenador"); 
		
	}
	
}
