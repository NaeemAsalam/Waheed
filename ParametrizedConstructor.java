class Box 
{
	double width;
	double height;
	double depth;
	Box(double width,double height,double depth)
	{
	this.width=width;
	this.height=height;
	this.depth=depth;
	}
	double volume()
	{
	return this width * this height * this depth;
	}
}
class ParametrizedConstructor
{
	public static void main(String args[])
	{
	Box obj1=new Box(10,20,30);
	Box obj2=new Box(3,6,9);
	double volume;
	volume=obj1.volume();
	System.out.println("volume is" +vol);
	volume=obj2.volume();
	System.out.println("volume is" +vol);
	}
}