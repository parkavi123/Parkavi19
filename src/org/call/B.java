package org.call;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class B {
	public static void main(String[] args) {
		//Set
		Set <Integer> B = new LinkedHashSet<Integer>();
		//To add the values
		B.add(10);
		B.add(20);
		B.add(30);
		B.add(40);
		B.add(50);
		B.add(50);
		B.add(50);
		B.add(60);
		System.out.println(B);
		
		//To find the Values
		int Size = B.size();
		System.out.println(Size);
		
		//To Check Contains or Not
		boolean P = B.contains(10);
		System.out.println(P);
		
		//Iterate the values from set
		// Enhanced for loop
		for(int X:B) {
			System.out.println(X);
		}
		
		List<Integer> li = new ArrayList<Integer> ();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(30);
		li.add(40);
		li.add(10);
		li.add(50);
		li.add(60);
		System.out.println(li);
		
		Set<Integer> st = new LinkedHashSet<Integer> ();
		System.out.println(st);
		
		//To remove the duplicate Values
		st.addAll(li);
		System.out.println(st);
		
		
	}

}
