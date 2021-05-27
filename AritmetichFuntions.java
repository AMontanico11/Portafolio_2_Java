package scl.edu.gt;

import java.util.Scanner;

public class AritmetichFuntions {
			
public static void suma() {
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("num_1: ");
		double num1 = numeral1.nextDouble();
		
		Scanner numera2 = new Scanner(System.in);
		System.out.print("num_2: ");
		double num2 = numera2.nextDouble();
		
		double respuesta = num1 + num2;
		
		System.out.println(respuesta);
	}
	
	public static void resta() {
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("num_1: ");
		double num1 = numeral1.nextDouble();
		
		Scanner numera2 = new Scanner(System.in);
		System.out.print("num_2: ");
		double num2 = numera2.nextDouble();
		
		double respuesta = num1 - num2;
		
		System.out.println(respuesta);
	}
	
	public static void division() {
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("num_1: ");
		double num1 = numeral1.nextDouble();
		
		Scanner numera2 = new Scanner(System.in);
		System.out.print("num_2: ");
		double num2 = numera2.nextDouble();
		double respuesta = num1 * num2;
		System.out.println(respuesta);
	}
	
	public static void multiplicacion() {
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("num_1: ");
		double num1 = numeral1.nextDouble();
		
		Scanner numera2 = new Scanner(System.in);
		System.out.print("num_2: ");
		double num2 = numera2.nextDouble();
		
		double respuesta = num1 / num2;
		
		System.out.println(respuesta);
	}
	
	public static void residuo() {
		
		Scanner numeral1 = new Scanner(System.in);
		System.out.print("num_1: ");
		double num1 = numeral1.nextDouble();
		
		Scanner numera2 = new Scanner(System.in);
		System.out.print("num_2: ");
		double num2 = numera2.nextDouble();
		
		double respuesta = num1 % num2;
		
		System.out.println(respuesta);
	}
	
	
	
	
}
