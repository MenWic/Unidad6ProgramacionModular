package src;
import java.util.*;

public class Ejercicio9 {
    //Variables de la clase
    int[][] arr1;
    int[][] arr2;
    int fila, col;
    int[][] suma;
    Scanner ent = new Scanner(System.in);

    public static void main(String[] args) {
        Ejercicio9 ejercicio9 = new Ejercicio9();
    }

    public Ejercicio9() {
        System.out.print("--- PROGRAMA: SUMA DE MATRICES DE 'n' CLUMNAS POR 'm' FILAS ---");
        System.out.println("\n");
        System.out.print("Ingrese el numero de filas que quiere: ");
        fila = ent.nextInt();
        System.out.print("Ingrese el numero de columnas que quiere: ");
        col = ent.nextInt();
        arr1 = new int[fila][col];
        arr2 = new int[fila][col];
        suma = new int[fila][col];

        if (fila == col) {
            System.out.println("*** LLENE DATOS DE LA PRIMERA MATRIZ ***");
            //Ciclo de ingreso de datos de Matriz A
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    System.out.print("Ingrese el numero para llenar tu matriz ");
                    arr1[i][j] = ent.nextInt();
                }
            }
            System.out.println("*** LLENE DATOS DE LA SEGUNDA MATRIZ ***");
            //Ciclo de ingreso de datos de Matriz A
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    System.out.print("Ingrese el numero para llenar tu matriz: ");
                    arr2[i][j] = ent.nextInt();
                }
            }

        } 

        else {
            System.out.println("*** !No se pueden sumar las matrices que no sean cuadradas! ***");
        }
        sumar();
        mostrar();
    }//FIn de clase

    //Metodo para mostarr matrices
    public void mostrar() {
        System.out.println("*** MATRIZ A ***");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("\n");
        }

        System.out.println("\n");
        System.out.println("*** MATRIZ B ***");
        for (int i = 0; i< arr2.length; i++) {
           
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println("\n");
        }

       System.out.println("\n");
        System.out.println("*** SUMA ***");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < suma.length; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }//Fin Metodo mostrar

    //Metodo Suma de matices 
    public void sumar() {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                suma[i][j] = arr1[i][j] + arr2[i][j];
            }
            System.out.println("\n");
        }
    }
}