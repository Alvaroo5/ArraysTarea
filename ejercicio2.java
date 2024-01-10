package ArraysTarea;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] arg) {
		
		int cantNum;
		float num;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Cuantos numeros quisiera introducir:");
		cantNum=sc.nextInt();
		int datos[] = new int[cantNum];
		
		int i;
		for(i=0; i<=cantNum; i++) {
			System.out.print("Introduce un numero:");
			num=sc.nextFloat();
		}
	}
	
}