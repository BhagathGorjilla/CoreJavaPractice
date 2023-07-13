package com.bg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l1= new ArrayList<Integer>() {};
		l1.add(1);
		l1.add(1);
		l1.add(3);
		l1.add(4);
		
		Collections.sort(l1);
		System.out.println("By using collkections sort : "+l1.get(l1.size()-2));
		
		int max_value = l1.get(0);
		int second = l1.get(0);
		
		for(Integer i : l1) {
			if(max_value < i) {
				second = max_value;
				max_value=i;
			}
			}
		System.out.println("Using for loop : "+ second +"  "+max_value);
			
		}

	

}
