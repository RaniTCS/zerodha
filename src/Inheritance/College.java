package Inheritance;

public class College//single level inheritance
{
    public static void main(String[] args)
    {
		Student s=new Student();
		s.delevering();
		s.playing();
		s.study();
		s.teach();
		s.writing();
		System.out.println("PASS WITH GOOD MARKS");
		
		
		//s.notify();  //call object class method
		//s.notifyAll();//call object class method
		//s.toString();//call object class method
	}
}
