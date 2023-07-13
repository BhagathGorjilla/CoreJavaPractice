package com.bg;

import java.util.*;

class GFG //implements Comparable<GFG> 
{

	String name;
	int rollNo;

	// constructor of class GFG
	GFG(String s, int n)
	{
		name = s;
		rollNo = n;
	}

	// over-riding the toString method
	// to print the collection
	public String toString()
	{
		return "Name : " + name + " | Roll No : " + rollNo;
	}

	/*
	 * @Override public int compareTo(GFG o) { // TODO Auto-generated method stub
	 * return this.rollNo-o.rollNo; }
	 */
	
}
public class ComparableComparator{
	// Driver Main Method
	public static void main(String[] args)
	{
		// creating an arraylist of user-defined collection
		ArrayList<GFG> arr = new ArrayList<GFG>();
		
		List<Integer> newarr = Arrays.asList(1,34,87,2,99);
		
		Comparator<GFG> com = new Comparator<GFG>() {

			@Override
			public int compare(GFG o1, GFG o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
			
		};

		Comparator<GFG> com1 = new Comparator<GFG>() {

			@Override
			public int compare(GFG o1, GFG o2) {
				// TODO Auto-generated method stub
				return o1.rollNo-o2.rollNo;
			}
			
		};
		
		// creating objects of class GFG
		GFG t1 = new GFG("John", 101);
		GFG t2 = new GFG("Haul", 102);
		GFG t3 = new GFG("Jack", 103);
		GFG t4 = new GFG("Bose", 104);

		// adding objects to arraylist
		arr.add(t1);
		arr.add(t2);
		arr.add(t3);
		arr.add(t4);
		
		Collections.sort(newarr);
		System.out.println(newarr);
		
		Collections.sort(arr,com);
		for (GFG c : arr)
			System.out.println(c);

		
		
		Collections.sort(arr,com1);

		// printing the collection
		for (GFG c : arr)
			System.out.println(c);
	}
}
