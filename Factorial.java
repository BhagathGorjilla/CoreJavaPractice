package com.bg;

import java.util.Scanner;

public class Factorial {
	
	public static int fact(int n) {
		if(n==0 || n==1) {
		return 1;
		}
		else {
			return n*fact(n-1);
		}
	}

	public static void main(String[] args) {
		
		int res=1;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Num: ");
		int n=sc.nextInt();
		System.out.println("With Recc : "+fact(n));
		
		
		
		for(int i=n;i>1;i--) {
			res=res*i;
		}
		System.out.println("Without Recc : "+res);
		
		sc.close();

	}

}
