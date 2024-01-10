package ArraysTarea;

import java.util.Scanner;

public class ejercicio3 {

public static void main(String[] arg) {
		
		int n;
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la cantidad de numeros que quiere introducir: ");
		n=sc.nextInt();
		int[] numeros = new int[n];
		int contador = 0;
		int i;
		for(i=0; i<n;i++) {
			System.out.print("Introduce un numero: ");
			num=sc.nextInt();
			numeros[i]=num;
			if (numeros[i] > 0) {
                int positivos = ++numeros[i];
            }else if (numeros[i] < 0) {
                int negativos = ++numeros[i];
            }else {
				contador++;
            }
		}
		
		/*
		float mediaPositivos = positivos / n;
		System.out.println("La media de los números positivos es: " + mediaPositivos);
        
		float mediaNegativos = negativos / n;
        System.out.println("La media de los números negativos es: " + mediaNegativos);
		*/
        System.out.println("El número de ceros introducidos es: " + contador);
		
	}
}
