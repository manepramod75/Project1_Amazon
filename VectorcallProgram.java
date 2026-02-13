package PramodAutomation;

import java.util.Enumeration;
import java.util.Vector;

public class VectorcallProgram 
{

	public static void main(String[] args)
	{
		
		Vector<Integer> v1= new Vector<Integer>();
		v1.add(50);
		v1.add(55);
		v1.add(10);
		v1.add(00);
		/*v1.add(0,100);
		v1.addFirst(9975);
		v1.addLast(4750);
		v1.addElement(123);
		*/v1.addLast(12345);
		
		
		Vector<Integer> v2= new Vector<Integer>();
		v2.add(50);
		v2.add(550);
		v2.add(10);
		v2.add(00);
		v2.addAll(v1);
		
		System.out.println(v1);
		
		v1.remove(4);
		
		System.out.println("Removing last "+v1);
		
		
		/*System.out.println(v1.isEmpty());
		System.out.println(v1.contains(9975));
		System.out.println(v1.containsAll(v2));
		System.out.println(v2.containsAll(v1));
		System.out.println(v1.capacity());
		*/
		System.out.println(v1.removeElement(v2));
		
		
		//System.out.println(v1);
		
		Enumeration<Integer> e1 = v1.elements();

		while (e1.hasMoreElements())
		{	
			System.out.println(e1.nextElement());
	    }
		
		v1.removeAll(v1);
		System.out.println("remove collection v1 "+v1);
		
   }
}
