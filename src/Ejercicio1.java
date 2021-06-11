package src;
import java.util.*;

public class Ejercicio1{
        //Metodo main
    public static void main(String[] args){
        Ejercicio1 t = new Ejercicio1();
    }
    //Variables globales de la clase  
    int[] elementos = new int[5];
    Scanner scanner = new Scanner(System.in);

    //Objeto Ejercicio1
    public Ejercicio1(){
    //Ciclos for para pedir y mostrar elementos/datos
        for(int i = 0 ; i<5; i++){
            pedirValor(i); 
        }
        for(int i = 0 ; i<5; i++){
            mostrarDato(i); 
        }
        //Variable Promedio
        double promed = getPromed();
        System.out.println("El promedio es: "+ promed);
    }
    //Metodo Obtener Promedio (Get)
    public double getPromed(){
        int tot = 0;
        //Ciclo for para representar un elemento ingresado como variable int tot
        for(int i = 0; i<5; i++){
            tot+=elementos[i];
        }
        double promed = (double)tot/5;
        return promed;
    }
    //Metodo Mostrar Datos
    public void mostrarDato(int num){
        System.out.println("El indice es "+num+ " el valor es: "+ elementos[num]);
    }
    //Metodo Pedir Datos
    public void pedirValor(int num){
        System.out.print("\nIngres el valor No. "+num+": ");
        elementos[num] = scanner.nextInt();
    }
}