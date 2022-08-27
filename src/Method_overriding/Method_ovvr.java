package Method_overriding;

public class Method_ovvr//ULC
{
  public static void main(String[] args) 
  {
	Animal a=new Animal();//super class object create
	a.animaltalk();
	
	Dog d=new Dog();
	d.dagtalk();
	
	Cat c=new Cat();
	c.cattalk();
}
}
