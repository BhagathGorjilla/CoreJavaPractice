package com.bg;

public class ExException {

	public static void main(String[] args) {
		try {
		int a=10;
		int b=a/1;
		System.out.println(b);
		//return;
		System.exit(0);
		
	}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Finally");
		}
		
		System.out.println("After Finally");
	}
}