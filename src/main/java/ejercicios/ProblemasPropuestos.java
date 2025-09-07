package ejercicios;

import java.util.Scanner;

public class ProblemasPropuestos {
	public void ej1() {
		int numRandom =(int) (Math.random() * 1000);
		System.out.println("Numero aleatorio: " + numRandom);
		int digitos = Integer.toString(numRandom).length();
		System.out.println("El numero tiene " + digitos + " digitos");;
	}
	
	public void ej2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de datos: ");
		int n = scanner.nextInt();
		
		float sum = 0;
		float prom = 0;
		
		
		int i = 0;
		while(i < n) {
			System.out.println("Ingrese altura (cms): ");
			int alt = scanner.nextInt();
			sum += alt;
			i++;
		}
		scanner.close();
		
		prom = sum / n;
		
		System.out.println("Promedio de alturas: " + prom);
	}
}
