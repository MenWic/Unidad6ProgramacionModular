package src;
import java.util.*;

public class Ejercicio3 {
    //Variables globales de la clase
    public int[] enteros = new int [8];
    public Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        Ejercicio3 ejercicio3 = new Ejercicio3();
    }

    public Ejercicio3 () {
        for (int i = 0; i < enteros.length; i++) {
            llenar(i);
        }
        System.out.println("*** ¿ Que valor quiere buscar ? ***");
        System.out.println(existe(entrada.nextInt()));
    }
    //Metodo llenar arreglo
    public void llenar(int indice) {
        System.out.print((indice+1)+") Ingrese el valor para este espacio: ");
        enteros[indice] = entrada.nextInt();
    }
    //Metodo mensaje de busqueda
    public boolean existe (int buscar){
        boolean existe = false;
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] == buscar) {
                existe = true;
            } else {
                existe = false;
            }
        }
        return existe;
    }
}
