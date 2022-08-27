package Exception;

public class Array_index_out_of_bound 
{
    public static void main(String[] args) 
    {
		String ar[]=new String[5];
		ar[0]="Pratap";
		ar[1]="akash";
		ar[2]="Vijay";
		ar[3]="Rocky";
		ar[4]="Amol";
		System.out.println(ar[3]);
		System.out.println(ar[1]);
		System.out.println(ar[5]);//Array index out of bound exception
		
		//it we do try to fetch index which is not there then we will get array index out of bound exception
	}
}
