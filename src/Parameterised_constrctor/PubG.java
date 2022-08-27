package Parameterised_constrctor;

public class PubG //User Logic Class (ULC)in this main method is used
{
   public static void main(String[] args)//main method
   {
	   Guns g=new Guns("AK47", 5); //create object of Guns Class(class name is Guns)
	   g.shoot(); //method called(method name is shoot)
	   System.out.println("1st shoot completed");
	   Guns g1=new Guns("PISTOL", 4);
	   g1.shoot();
	   System.out.println("2nd shoot completed");
	   Guns g2=new Guns("MG42", 3);
	   g2.shoot();
	   System.out.println("3rd shoot completed");
	   Guns g3=new Guns("HandGuns", 4);
	   g3.shoot();
	   System.out.println("4th shoot completed");
	   Guns g4=new Guns("Rifle", 4);
	   g4.shoot();
	   System.out.println("5th shoot completed");
}
}
