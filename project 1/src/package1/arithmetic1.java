package package1;

public class arithmetic1 
{
	public int sum (int a,int b)
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
		System.out.println("sub result is="+z);
		return z;
	}
	public int multi (int u,int v)
	{
		int w;
		w=u*v;
		System.out.println("multi result is="+w);
		return w;
	}
	public void div (int p, int q)
	{
		int r;
		r=p/q;
		System.out.println("final result is="+r);
	}
	public static void main(String[] args)
	{
		arithmetic1 c=new arithmetic1();
		int sumresult=c.sum(10, 2);
		int sumresult1=c.sum(sumresult, 2);
		int subresult=c.sub(sumresult1, 2);
		int multiresult=c.multi(subresult, 2);
		c.div(multiresult, 2);
	}

}
