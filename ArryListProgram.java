package PramodAutomation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArryListProgram {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		//a1.add("Pramod");
		//a1.add(true);
		//a1.add(7);
		//a1.addAll(0, a1);
		//a1.add('P');
		a1.add(75);
		a1.add(10);	
		a1.add(10);
		a1.add(5);
		a1.add(2);
		
		System.out.println(a1);
		
		Iterator<Integer>i1 = a1.iterator();
		
		while (i1.hasNext()) {
			
			System.out.println(i1.next());
		}
		
		ListIterator<Integer> i2 =a1. listIterator();
		
		while (i2.hasNext()) {
			
			System.out.println(i2.next());
			
		}
			
		
		
		
		
		
		
		

	}

}
