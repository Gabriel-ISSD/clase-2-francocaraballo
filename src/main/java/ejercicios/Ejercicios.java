package ejercicios;

import java.util.Scanner;

public class Ejercicios {
	public void Problema1 () {
		System.out.println("Numeros del 1 al 100: ");
		int i = 1;
		while(i <= 100) {
			System.out.print(i + "-");
			i++;
		}
	}
			
	 public void Problema2() {
			int numRandom =  2 + (int) (Math.random() * 99);
			int i = 2;
			System.out.println("Numero aleatorio: " + numRandom);
		while( i <= numRandom) {
			System.out.print(i + "-");
			i++;
			
		}
	}
	
	public void Problema3() {
		Scanner scanner = new Scanner(System.in);
		int suma = 0;
		int i = 0;
		float promedio;
		
		while( i < 5) {
			System.out.println("Ingrese un numero: ");
			int input = scanner.nextInt();
			suma += input;
			i++;
		}
		scanner.close();
		promedio = (float)suma / 5;
		System.out.println("La suma de los numeros es: " + suma);
		System.out.println("El promedio es: " + promedio);
	}
	
	public void Problema4() {
		
	}
	
}
