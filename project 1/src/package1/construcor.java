package package1;

public class construcor 
{
	public construcor() 
	{
		this (12,44,55);
		System.out.println("default constructor");
	}
	public construcor(int a) 
	{
		this ();
		System.out.println("one paramerter constructor");
	}
	public construcor(int a, int b) 
	{
		this (12);
		System.out.println("two parameter constructor");
	}
	public construcor(int a,int b,int c ) 
	{
		System.out.println("three parameter constructor");
	}
	public construcor(int a, int b, int c, int d) 
	{
		this (23,24);
		System.out.println("four parameter constructor");
	}
	public static void main(String[] args) 
	{
		construcor obj=new construcor(34,40,30,21);
	}





}
