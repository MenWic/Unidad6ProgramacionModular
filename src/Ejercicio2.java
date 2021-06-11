package src;
public class Ejercicio2 {
    public static void main(String[] args) {
        Ejercicio2 t = new Ejercicio2();
    } 
    //Variables globales de la clase
    int[] elementos = new int[10];
    int n;
    int mayor = -1;
    int repet = 0;

    //Objeto Ejercicio2
    public Ejercicio2(){
        //Ciclo generar datos de arreglo
        for(int i = 0 ; i<10; i++){
           numAleatorio(i);
        }
        System.out.println("\n");
        // Ciclo mostrar datos del arreglo
        for(int i = 0 ; i<10; i++){
            mostrarDato(i); 
        }
        //Metodo determiancion del mayors
        determMayor();
        System.out.println("El numero Mayor es: "+mayor+", y se repite "+repet+" veces.");
    }
    //Metodo generar numeros aleatorios
    public void numAleatorio(int num){ //elementos[i]
        n = (int) (Math.random()*99);
        elementos[num] = n;
    
        System.out.println("Posicion" + num+", Numero aleatorio: "+ n);
    }
    //Metodo Mostrar Datos
    public void mostrarDato(int num){
        System.out.println("El indice es "+num+ " el valor es: "+ elementos[num]);
    }    
    public void determMayor() {
        for(int i = 0 ; i<10; i++) {
            if (elementos[i] > mayor) {
                mayor = elementos[i];
            }
        }       
        for (int j = 0; j < 10; j++) {
            if (elementos[j] == mayor) {
                repet++;
            }
        } 
    }
}