package PramodAutomation;

class Bapu 
{
	 void marry() {
		System.out.println("login with otp");
	}
}

public class Pamu extends Bapu 
{
	 void marry() 
	 {
		 
		System.out.println("login with mobile number");
		super.marry(); // keyword used to to call parent class implementation along with child class incase of method overriding 
	}


//public class MethodOverloadingEx {

	public static void main(String[] args) 
	{
		Pamu p = new Pamu();
		p.marry();
	}

}
