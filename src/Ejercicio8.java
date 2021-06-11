package src;
import java.util.*;

public class Ejercicio8{
    //Variables globales de la clase
	String posicionP1;
	String posicionP2;
    Scanner scanner=new Scanner(System.in);
	String[] arr1= new String[5];
	String[] arr2=new String[5];
    //Objeto creado by constructor
	public Ejercicio8(){
		llenarArreglo();
		comparacionStrings();
	}

	public void llenarArreglo(){
		for (int i=0;i<arr1.length;i++ ) {
			System.out.print("Ingrese la palabra "+(i+1)+" del 1er listado: ");
			arr1[i]=scanner.nextLine();
		}
		System.out.println("\n");
		for (int j=0;j<arr2.length;j++ ) {
			System.out.print("Ingrese la palabra "+(j+1)+" del 2do listado: ");
			arr2[j]=scanner.nextLine();
		}
		System.out.println("\n");
	}

	public void comparacionStrings(){
		for (int i=0;i<arr1.length;i++) {
			if (arr1[i].length()==arr2[i].length()) {
			System.out.println("\nLa cant. de palabras en posicion "+ (i+1) +" es igual");
            System.out.println("\n");
			System.out.println("La cant. de palabras de: "+arr1[i] +" y "+arr2[i]+", es: "+arr2[i].length()+" letras");
			} else {
				System.out.println("\nLa cant. de palabras en la posicion "+(i+1)+" no es iguales");
			}	
		}
	}

	public static void main(String[] args) {
		Ejercicio8 ejercicio8 = new Ejercicio8();
	}
}