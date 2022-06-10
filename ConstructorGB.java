class Addition
{
	int x,y;
	Addition(int a,int b)
	{
		x = a;
		y = b;
	}
}
public class ConstructorGB
{
	public static void main(String args [])
	{
		Addition P = new Addition();
		System.out.println(P.x+P.y);
	}
}