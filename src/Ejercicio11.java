package src;
import java.util.*;

public class Ejercicio11{
	//variables globales de clase
	double[] notas=new double[6];
	String[] alumnos=new String[6];
	String[] resultadoNota=new String[6];
	Scanner scanner=new Scanner(System.in);
	double nota;
	double porcentajeNota;
	String alumno;
	//Objeto
	public Ejercicio11(){
		pedirDatos();
		resultadosNotas();
		mostrarResultados();
	}
	//Metodo pedir datos
	public void pedirDatos(){
		for (int i=0;i<alumnos.length;i++ ) {
			System.out.print("Ingrese el nombre del alumno No."+(i+1)+": ");
			alumno=scanner.next();
			System.out.print("Ingrese la nota del alumno No."+(i+1)+": ");
			nota=scanner.nextDouble();
			if (nota>=0 && nota<=10) {
				alumnos[i]=alumno;
				notas[i]=nota;
				System.out.println("----Alumno Registrado-----");
			} else {
				System.out.println("!Ingreso una nota incorrecta!");
				i--;
			}
		}
	}
	//Metodo resultado de las notas ingresadas
	public void resultadosNotas(){
		for (int i=0;i<alumnos.length;i++) {
			if (notas[i]>=0 && notas[i]<=4.99) {
				resultadoNota[i]="Suspenso";
			} else if(notas[i]>=5 && notas[i]<=6.99){
				resultadoNota[i]="Bien";
			} else if (notas[i]>=7 && notas[i]<=8.99) {
				resultadoNota[i]="Notable";
			} else if (notas[i]>=9 && notas[i]<=10) {
				resultadoNota[i]="Sobresaliente";
			}
		}

	}
	//Metodo mostrar los resultados de notas
	public void mostrarResultados(){
		for (int i=0;i<alumnos.length;i++) {
			System.out.println("\nAlumno: "+alumnos[i]);
			System.out.println("Nota: "+notas[i]);
			System.out.println("Resultado: "+resultadoNota[i]);
		}
	}

	public static void main(String[] args) {
		Ejercicio11 ejercicio11= new Ejercicio11();
	}
}