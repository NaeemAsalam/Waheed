class MainDemoException
{
	public static void main(String arg[])
	{
	int a=60;
	try{
	int c=a/0;
	System.out.println("c:"+c);
	}
	catch(ArithmeticException e)
	{
	System.out.println("Arithmetic Exception");
	}
	System.out.println("After catch");
	}
} 