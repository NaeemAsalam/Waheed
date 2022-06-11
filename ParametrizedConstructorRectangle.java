class Rectangle
{
	int length;
	int breadth;
	Rectangle(int l,int b)
	{
	lenght = l;
	breadth = b;
	}
	int area()
	{
	return(lenght*width);
	}
}
public class ParametrizedConstructorReactangle
{
	public static void main(String args[])
	{
		Rectanghe FirstRectangle = new Rectangle(5,6);
		Rectangle SecondRectangle= new Rectangle(7,8);
		System.out.println("Area of First Rectangle :"+firstRect.area());
		System.out.println("Area of Second Rectangle:"+secondRect.area());
	}
}