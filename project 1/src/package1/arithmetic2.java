package package1;

public class arithmetic2 
{
	public int sum (int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is="+c);
		return c;
	}
	public int sub (int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("sub result is ="+z);
		return z;
	}
	public void multi (int p, int q)
	{
		int r;
		r=p*q;
		System.out.println("final result is="+r);
	}
	public int div (int u, int v)
	{
		int w;
		w=u/v;
		System.out.println("div result is="+w);
		return w;
	}
	public static void main(String[] args) 
	{
		arithmetic2 obj=new arithmetic2();
		int divresult=obj.div(10, 2);
		int subresult=obj.sub(divresult,2);
		int subresult1=obj.div(subresult, 2);
		int sumresult=obj.sum(subresult1,2);
		obj.multi(sumresult,2);
		
	}

}
