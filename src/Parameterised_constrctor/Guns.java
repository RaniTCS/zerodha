package Parameterised_constrctor;

public class Guns //this is Business Logic Class(BLC) Because no main method used in this class.
{
    String gunName;
    int noOfBullets;
    public Guns( String gunName, int noOfBullets)  //Constructor(parameterised)
    {                    // constructor  body open
    	this.gunName=gunName;
    	this.noOfBullets=noOfBullets;
    }               // close Constrctor body
     public void shoot()
     {
        for(int i=1;i<=noOfBullets;i++)
        {
    	System.out.println("Deshkaw");
        }
      }
}

