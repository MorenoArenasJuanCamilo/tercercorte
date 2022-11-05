
public class Masajista extends Persona {

	
	
	private String titulacion;
	private int añosdeexperiencia;
	
	
	

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAñosdeexperiencia() {
		return añosdeexperiencia;
	}

	public void setAñosdeexperiencia(int añosdeexperiencia) {
		this.añosdeexperiencia = añosdeexperiencia;
	}

	
	
	public void darmasaje() {
		
		
		
	}
	public void viajarmasajista() {
		
		System.out.println( super.viajar() + " Masajista"); 
		
	}
	
}
