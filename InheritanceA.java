package PramodAutomation;

class A
{
	static void Login() {
		

	 System.out.println("Signin");
		
	}
	
class B extends A
{
	static void explore () {
		
		System.out.println("signout");
	}
}

public class InheritanceA extends B
{

	static void logout()
	{
		System.out.println("output");
	}
	public static void main(String[] args) {
		
		Login();
		explore();
		logout();
	}
}

	}

