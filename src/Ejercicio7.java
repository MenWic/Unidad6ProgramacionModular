package src;

public class Ejercicio7{
    //Variables globales de la clase
	int[][] matriz;
	//variables generadas despues de las iniciales
	int numero;
	int suma=0;
	int m;
	int n;

	public Ejercicio7(){
        //Variables globales del objeto
		m=4;
		n=3;
		llenarMatriz();
		mostrarMatriz();
		sumarFilaPar();
	}
    //Metodo para llenar arreglo/matriz
	public void llenarMatriz(){
		matriz=new int[m][n];
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++){
				matriz[i][j]=(int)(Math.random()*555);
			}
		}
	}
    //Metodo para mostar la matriz llena
	public void mostrarMatriz(){
		System.out.println("Matriz con numeros aleatorios: ");
		for (int i=0;i<m;i++) {
			System.out.println("\n");
			for (int j=0;j<n;j++){
				System.out.print("["+matriz[i][j]+"]");
			}
		}
	}
    //Metodo para sumar filas pares ->
	public void sumarFilaPar(){
		int i=1;
		for (int j=0;j<n;j++) {
			suma+=matriz[i][j];	
		}
		int k=3;
		for (int j=0;j<n;j++) {
			suma+=matriz[k][j];
		}
		System.out.println("\n\nLa suma de las filas (Horizontales) pares es: "+suma);
	}
    //NO ES BUENA PRACTICA DEJAR ESTA MADRE HASTA EL FINAL
	public static void main(String[] args) {
		Ejercicio7 ejercicio7 = new Ejercicio7();
	}
}