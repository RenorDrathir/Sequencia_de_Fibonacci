package application;
import java.util.Scanner;

import entities.Checker;

public class Program {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int n = sc.nextInt();

	        if (Checker.isFibonacci(n)) {
	            System.out.println(n + " pertence à sequência de Fibonacci.");
	        } else {
	            System.out.println(n + " não pertence à sequência de Fibonacci.");
	        }

	        sc.close();
	}
		
}
