class Addition
{
	int x,y,z;
	void add(int a,int b)
	{
	x = a;
	y = b;
	System.out.println("x+y="+(x+y));
	}
	void add(int a,int b,int c)
	{
	x = a;
	y = b;
	z = c;
	System.out.println("x+y+z="+(x+y+z));
	}
}
public class MethodOverloading
{
	public static void main(String args[])
	{
	Addition p = new Addition();
	p.add(10,20);
	p.add(40,60,30);
	}
}	