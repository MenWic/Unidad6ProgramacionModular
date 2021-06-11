package src;
import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {
        Ejercicio5 ejercicio5 = new Ejercicio5();
    }
    
    //Variables globales de la clase
    int [] N = new int[100];
    int a =0;
    double suma =0;
    Scanner scanner = new Scanner(System.in);

    //Objeto 
    public Ejercicio5() {
        String s ="";
        do {
            ingresar();
            sum();
            medio();
            System.out.print("Deseas seguir (s = si / n = no): ");
            s = scanner.next();
        } while (s.equalsIgnoreCase("s"));
    }
    //Metodo Ingresar datos
    public void ingresar(){
        int valor = 0;
        a = 0;
        do {
            System.out.print("\nIngrese un valor: ");
            N[a] = scanner.nextInt();
            valor = N[a];
            a++;
        } while (valor != (-50));
        System.out.println("\n***Salio***");
    }
    //Metodo ingresar valor medio
    public void medio(){
        if (0<a) {
            double media = suma/a;
            System.out.println("valor medio es: "+media);    
        }else{
            System.out.println("no ingreso ningun valor");
        }
    }
    //Metodo de Suma
    public void sum(){
        a = 0;
        while (N[a]!=-50) {
            suma += N[a];
            a++;
        }
    }
}