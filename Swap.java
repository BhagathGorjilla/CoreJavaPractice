package com.bg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Swap {
	int a;
	
	@Override
	public int hashCode() {
		return Objects.hash(a);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Swap other = (Swap) obj;
		return a == other.a;
	}

	public static void swapping(int a , int b) {
		System.out.println("Before SWAP");
		System.out.println(a+" : "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After SWAP");
		System.out.println(a+" : "+b);
	}

	public static void main(String[] args) {
		
		swapping(2,5);

	}

}