package com.assesment1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		 arithmeticOperations operations = new arithmeticOperations();
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int num1 = scanner.nextInt();
	        operations.setOperand1(num1);

	        System.out.print("Enter second number: ");
	        int num2 = scanner.nextInt();
	        operations.setOperand2(num2);

	        System.out.println("Sum: " + operations.add());
	        System.out.println("Subtraction: " + operations.subtract());
	        System.out.println("Product: " + operations.multiply());
	        System.out.println("Division: " + operations.divide());
	        System.out.println("Remainder: " + operations.modulus());

	        scanner.close();

	}

}
