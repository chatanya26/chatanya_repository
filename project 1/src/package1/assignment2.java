package package1;

public class assignment2 
{
	public void m1 () 
	{
		this.m4(11, 3, 5);
		System.out.println("default method");
		
	}
	public void m2(int a)
	{
		this.m1();
		System.out.println("one parameter method");
		
	}
	public void m3(int a, int b)
	{
		this.m2(34);
		System.out.println("two parameter method");
	}
	public void m4(int a, int b, int c)
	{
		System.out.println("three parameter method");
	}
	public void m5(int a, int b, int c, int d)
	{
		this.m3(15,35);
		System.out.println("four parameter method");
	}

	public static void main(String[] args) 
	{
		assignment2 obj=new assignment2();
		obj.m5 (11,13,14,15);
		
	}
}
