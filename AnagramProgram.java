package JavavivaPractice;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "voilent";
		
		char [] a = s1.toCharArray();
		char [] b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if (Arrays.equals(a,b))
		{System.out.println("P");}
		else
		{System.out.println("No P");}
		

	}

}
