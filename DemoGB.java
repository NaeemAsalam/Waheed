class Dog 
{
	String color ="Red";
	String Name = " Puppy";
	void barking();
	{
	System.out.println("Dog is barking");
	}
}
public class DemoGB
{
	public static void main(String args[])
	{
		Dog d1=new Dog();
	System.out.println(d1.color);
	System.out.println(d1.name);
	d1.barking();
	}
}