package com.bg;

import java.util.Scanner;

public class Fibonacci {

	public static int fib(int n) {
		/*System.out.println();
		System.out.println("Fibbonicci with Recc");

		int a = 0;
		int b = 1;
		int res = 100;
		System.out.print(a + " " + b);

		
		 * for (int i = 1; i < n; i++) { res = a + b; System.out.print(" " + res); a =
		 * b; b = res;
		 
		}*/
		
		if(n == 0) {
			return 0;
		}
		if(n==1 || n==2) {
			return 1;
		}
		return fib(n-2) + fib(n-1);

	}

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int res = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n = sc.nextInt();
		System.out.println("Fibbonicci without Recc");
		System.out.print(a + " " + b);

		for (int i = 1; i <= n; i++) {
			res = a + b;
			System.out.print(" " + res);
			a = b;
			b = res;
		}
		System.out.println();
		System.out.println("Fibbonicci with Recc");
		for (int i = 0; i < n; i++) {
		System.out.print(fib(i)+ " ");
		}
		sc.close();
	}

}
