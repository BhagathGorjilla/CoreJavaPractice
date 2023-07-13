package com.bg;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharFreqinStr {
	
public void charCount(String str) {
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		char[] arr = str.toCharArray();
		
		for(char c : arr) {
			if(map.containsKey(c)) {
				
				map.put(c,map.get(c)+1);
			}
			else
				map.put(c,1);
		}
		for(Map.Entry i : map.entrySet()) {
			
			System.out.println(i.getKey() +"  : "+i.getValue());
		}
		
		Set<Character> keys = map.keySet();
		//Collection<Integer> keys1 = map.values();
		System.out.println(keys);
		
		for (Character ch: keys) {
			if(map.get(ch)>map.get(ch))
			System.out.println(map.get(ch));
		}
		System.out.println();
		
		int j=0;
		for(int i=0;i<keys.size();i++) {
	    
		for (Character ch: keys) {  	
	        if (map.get(ch) == j) {
	            System.out.println(ch + " ");       
	        }
	    } 
		j++;
		}
		
	}

	public static void main(String[] args) {

		CharFreqinStr m=new CharFreqinStr();
		m.charCount("aaaabbbccc");
		m.charCount("bhagath");
	}

}
