package PramodAutomation;
class submethod1 extends MethodeOverr 
{
	void Login()
	{
		System.out.println("log in with mobile number");
	}
}

 public class MethodeOverr {

	void Login() {
		System.out.println("log in with otp");
	}
	public static void main(String[] args) 
	{
		submethod1 s1 = new submethod1();
		s1. Login ();
	
	}
}

 

