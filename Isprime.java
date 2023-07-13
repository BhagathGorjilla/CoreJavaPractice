package com.bg;

import java.util.Scanner;
import java.util.stream.IntStream;

interface primeNumber{
	boolean isprime(int num);
	boolean iseven(int num);
}

public class Isprime implements primeNumber {
	

	@Override
	public boolean isprime(int num) {
		return num>1 && IntStream.range(2,num).noneMatch(i->num%i==0);
	}

	@Override
	public boolean iseven(int num) {
		if(num ==2) {
			return true;
		}
		else if(num%2 == 0)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		
		Isprime ip = new Isprime();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		System.out.println("Prime Number : "+ip.isprime(n));
		System.out.println("Even Number : "+ip.iseven(n));
		
		sc.close();
		
	}
}
