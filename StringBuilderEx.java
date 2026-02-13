package PramodAutomation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		Set<Integer> s1= new HashSet <Integer> ();
		
		s1.add(100);
		s1.add(50);
		s1.add(150);
		s1.add(50);
		s1.add(null);
		//s1.addAll(s1);
		s1.add(00);
		s1.add(1000);
		
		//System.out.println(s1);
		
		Iterator<Integer> i3 = s1.iterator ();

		while(i3.hasNext()) 
		{
	
			System.out.println(i3.next());
		}
		
	}

}
