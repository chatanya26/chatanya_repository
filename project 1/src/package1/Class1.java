package package1;

public class Class1 
{
	int a;
	public void method1()
	{
		System.out.println("welcome to all of you");
	}
	public static void main(String[] args) 
	{
		Class1 c=new Class1();
		c.method1();
		c.a=11;
		System.out.println(c.a);
		c.method1();
		c.a=133;
		System.out.println(c.a);
		
	}	
}
