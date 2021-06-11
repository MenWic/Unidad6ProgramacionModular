package src;

public class Ejercicio4 {
    
    public static void main(String[] args){
        Ejercicio4 t = new Ejercicio4();
    }
    //Variables globales de la clase
    int[] elementos = new int[10];
    int n;
    int mayor = -1;
    int repet = 0;

    //Objeto Ejercicio2
    public Ejercicio4(){
        //Ciclo generar numeros/datos del arreglo
        for(int i = 0 ; i<10; i++){
           numAleatorio(i);
        }
        System.out.println("\n");
        // Ciclo mostrar datos/numeros del arreglo
        for(int i = 0 ; i<10; i++){
            mostrarDato(i); 
        }
        //Metodo determiancion del mayor
        determMayor();
        System.out.println("\n");
        System.out.println("El numero Mayor es: "+mayor+".");
        System.out.println("\n");
        distanciaMayor();
    }
    
    //Metodo generar numeros aleatorios
    public void numAleatorio(int num){ //elementos[i]
        n = (int) (Math.random()*10);
        elementos[num] = n;
    
        System.out.println("Posicion" + (num+1)+", Numero aleatorio generado: "+ n);
    }
    //Metodo Mostrar Datos
    public void mostrarDato(int num){
        System.out.println("El indice es "+(num+1)+ " el valor es: "+ elementos[num]);
    }    
    public void distanciaMayor(){
    int separacion;
    	for(int i=0;i<elementos.length;i++){
    		separacion=mayor-elementos[i];
    		System.out.println("La separacio de "+mayor+" con "+elementos[i]+" es: "+separacion);
    	}
    }
    
    public void determMayor() {
        for(int i = 0 ; i<10; i++) {
            if (elementos[i] > mayor) {
                mayor = elementos[i];
            }
        }       
        for (int j = 0; j < 10; j++) {
            //Crear metodo o do while de distancias entre numeros
            /* if () {
            } */
        } 
    }
}
