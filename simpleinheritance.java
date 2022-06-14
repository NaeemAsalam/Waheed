class A
{
	int i,j;
	void show i,j ()
	{
	System.out.println("i and j:"+i+" +j);
	}
}
class B extends A
{
	int k;
	void show k ()
	{
	System.out.println("k:"+k);
	}
	void sum("i+j+k:"+(i+j+K));
	}
}
public class simpleinheritance
{
	public static void main(String args[])
	{
	A superob = new A();
	B subob   = new B();
	superob.i=10;
	superob.j=20;
	System.out.println("content of superob:");
	superob.show i i();
	System.out.println();
	subob.i=7;
	subob.j=8;
	subob.k=9;
	System.out.println("content of subob:");
	subob.showi j();
	subon.show k ();
	System.out.println();
	System.out.println("sun of i,j and k in subob:");
	subob.sum();
	}
}