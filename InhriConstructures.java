package PramodAutomation;

class Amozon_parant 
{
	Amozon_parant ()

	{
		System.out.println("stmt1");

	}
}
	class Amozon_Gparant extends Amozon_parant
{
		Amozon_Gparant ()

	{
			//super();
			System.out.println("stmt2");

	}
}
public class InhriConstructures extends Amozon_Gparant 
{
	InhriConstructures ()
	
	{
		super();
		System.out.println("Stmt 3");
	}
	public static void main(String[] args) {
	
		new InhriConstructures();
	}	
}
