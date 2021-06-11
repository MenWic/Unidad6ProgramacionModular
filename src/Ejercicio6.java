package src;
import java.util.*;

public class Ejercicio6 {
    //Variables globales de la clase
    int [][]nums={{5,6,13},
               {14,2,4},
               {21,7,6}};

    public static void main(String[] args) {
        Ejercicio6 Ejercicio6 = new Ejercicio6();
    }

    public Ejercicio6(){
        System.out.println("** Multiplicando XD ***");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                nums[i][j]*=2;
            }
        }
        mostrando();
    }

    //Metodo mostrando resultado
    public void mostrando(){
        System.out.println("El resultado es: ");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
