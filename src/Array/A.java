package Array;

public class A //ULC
{
   public static void main(String[] args) 
   {
	   int[] i =new int[5];
	   i[0]=10;
	   i[1]=20;
	   i[2]=30;
	   i[3]=40;
	   i[4]=50;
	   //print first index printed
	  System.out.println(i[1]);
	  //System.out.println(i[9]);//array index out of bound exception.
	  //when we try to fetch data which is not there then we will get AIOOBE.
	  for(int j=0;j<=4;j++)
	  {
		  System.out.println(i[j]);
	  }
}
}
