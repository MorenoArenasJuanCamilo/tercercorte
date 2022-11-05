import java.util.Scanner;

public class Principal {
 
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner (System.in);
	Futbolista fut =new Futbolista();
	Entrenador entr =new Entrenador();
	Masajista mas=new Masajista();
	Persona per=new Persona();
	
		System.out.println("Digite Cual Clase quiere ir");
		System.out.println("Oprima 1 para ir ala clase Futbolista");
		System.out.println("Oprima 2 para ir ala clase masajista");
		System.out.println("Oprima 3 para ir ala clase Entrenador");
		int dato = sc.nextInt();
		
		if(dato==1) {
			per.viajar();
			fut.viajefutbolista();
		}
		if(dato==2) {
			per.viajar();
			mas.viajarmasajista();
		}
		if(dato==3) {
			per.viajar();
			entr.viajarentrenador();
		}
		
	}
}
