package PRACTICE;

public class Pubg   //user logic class because main method used in this program
{
	public static void main(String[] args)
	{
		Gun g=new Gun();   //this is creating object of class Gun
		g.name="AK47";     // then take reference variable name g 
		g.noOfBullets=4;
		g.shoot();              // method calling from diff. class
		System.out.println("finished bullets");
		
	}

}
