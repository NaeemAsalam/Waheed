class Box
{
	double width;
	double height;
	double depth;
	Box(double w, double h, double  d)
	{
	width = w;
	height=h;
	depth = d;
	}
	Box()
	{
	width = -1;
	height = -1;
	depth = -1;
	}
	Box(double len)
	{
	width=height=depth=len
	}
	double vol()
	{
	return width*height*depth;
	}
}
public class ConstructorOverloading
{
	public static void main(String args[])
	{
	Box mybox1=new Box(10,20,15);
	Box mybox2=new Box();
	Box mycube=new Box(7);
	double volume();
	volume=mybox1.volume();
	System.out.println("volume of mybox1 is"+vol);
	volume=mybox2.volume();
	System.out.println("volume of mybox2 is"+vol);
	volume=mycube.volume();
	System.out.println("volume of mycube is"+vol);
	}
}