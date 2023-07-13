package com.bg;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		int rem;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n = sc.nextInt();
		int temp = n;
		while(n>0) {
		rem = n%10;
		sum=(sum*10)+rem;
		n=n/10;
		}
		if(sum == temp) {
			System.out.println("palindrome");}
		else {
			System.out.println("Not a palindrome");}
		sc.close();

	}

}
