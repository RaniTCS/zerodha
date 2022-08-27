package Constructor;

public class Pubg5
{
   public static void main(String[] args)
   {
	   Gun5 x=new Gun5();   //creating object of Gun5 class(means diff. class)
	   x.name="AK47";        // x is the name of reference variable name
	   x.Qunatity=5;
	   x.shoot();        //reference variable name with method name shoot()
	   System.out.println("finished");
	
}
}
