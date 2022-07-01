package package1;

public class student 
{
	int age;
	int roll_no;
	public void display1()
	{
		System.out.println("Welcome to all");
	}
	public void display2()
	{
		System.out.println("automation is very easy");
	}
	public static void main(String[] args)
	{
		student c=new student();
		c.display1();
		c.display2();
		c.age=23;
		System.out.println(c.age);
		c.roll_no=10;
		System.out.println(c.roll_no);
	}
}
