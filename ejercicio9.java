/*Definir una función que tome como parámetros dos tablas, la primera con 6 números de una apuesta de la primitiva, y la segunda con los 6 números de la combinación ganadora. La función devolverá el número de aciertos.*/
package ArraysTarea;

import java.util.Scanner;

public class ejercicio9 {

	public static int aciertosPrimitiva(int[] a, int[] b) {
		int numAciertos=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j])
					numAciertos++;
			}
		}
		return numAciertos;
	}
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		final int TAM=5;
		int[] combinacionGanadora = new int [TAM];
		
		int[] combinacionUsuario = new int[TAM];
		
		for(int i=0; ;i++);
	}
}
