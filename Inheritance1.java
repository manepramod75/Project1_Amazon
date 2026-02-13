package PramodAutomation;

class Inheritance1 
{
	
 static void login ()
{
 System.out.println ("Login");
	
}
static void logout ()
{
 System.out.println ("Logout");

}

 public class ram extends Inheritance1 
 {
	// static void Use() {

//System.out.println("Use");
// } 
public static void main(String[] args) {

//Inheritance1 i1=new Inheritance1 (); 
login();
//Use();
logout();
	}
 
}
}

