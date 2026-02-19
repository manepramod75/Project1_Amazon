package JavavivaPractice;

public class Palindrom {

	public static void main(String[] args) {
		
		String a = "radar";
		//String a = "Pramod";
		String b = "";
		
		for (int i = a.length()-1;i>=0;i--)
		{
			b = b+a.charAt(i);
		}
		System.out.println("b");

		if (a.equals(b))
		{
			
			System.out.println("Palindrom");
		}
		else 
		{
			System.out.println("its not palindrom");
			
		}
	}
	

}
