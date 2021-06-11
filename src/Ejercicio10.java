package src;
import java.util.*;

public class Ejercicio10 {
    //Variables globales de la clase
    int [][] matriz;
    Scanner scanner = new Scanner(System.in);

    public Ejercicio10(){
        //Variables iniializadas de trancaso xd
        System.out.print("--- INICIANDO PROGRAMA ---\n");

        System.out.print("Ingrese el numero de filas de la Matriz: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el numero de columans de la Matriz: ");
        int columnas = scanner.nextInt();
        matriz = new int [filas][columnas];
        System.out.println("\n***GENERANDO MATRIZ ***");

        llenarMatriz();
        mostrarMatriz(matriz);
        System.out.println("\n*** MATRIZ TRASPUESTA ***");
        matrizTraspuesta();
        System.out.println("\n");
    }

    //Metodo estatico para guardar el random (me llevo la chin***a hasta encontrar esto de Static)
    public static int random(int min, int max){
        int random = (int) Math.floor(Math.random()*(max-min+1)+min);
        return random;
    }
    //Metodo llenar matriz
    public void llenarMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random(10, 99);
            }
        }
    }
    //Metodo mostrar matriz
    public void mostrarMatriz(int [][] numsMatriz){
        for (int i = 0; i < numsMatriz.length; i++) {
            for (int k = 0; k < numsMatriz[i].length; k++) {
                String valor = Integer.toString(numsMatriz[i][k]);
                System.out.print(valor + "   ");
            }
            System.out.println("\n");
        }
    }
    //Metodo Matriz Transpuesta
    public void matrizTraspuesta(){
        int [][] matrizT = new int [matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }
        mostrarMatriz(matrizT);
    }
    public static void main(String[] args) {
        Ejercicio10 ejercicio10 = new Ejercicio10();
    }
}
