package ArraysTarea;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] arg) {
		
		float num;
		float datos[] = new float[5];
		Scanner sc = new Scanner(System.in);
		
		int i;
		for(i=0; i<datos.length; i++) {
			System.out.print("Introduce un numero decimal:");
			num=sc.nextFloat();
			datos[i]=num;
		}
		for(i=0; i<datos.length; i++) {
			System.out.println(datos[i]);
		}
	}
	
}