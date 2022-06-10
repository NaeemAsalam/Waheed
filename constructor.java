class Addition
{
	int x , y ;
	Addition (int a , int b)
	{
		x = a;
		y = b;
	}
}
public class Constructor
{
	public static void main(String args[])
	{
		Addition q = new Addition (30,40);
		System.out.println(q.x + q.y);
	}
}