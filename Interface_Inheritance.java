abstract class Animals
{
	abstract void eat();
}
class Spider extends Animals
{
	void eat()
	{
		System.out.println("Spider eats insects");
	}
	void walk()
	{
		System.out.println("The animal walks by 8 legs");
	}
}
interface Pet
{
	void name();
}
class Fish extends Animals implements Pet
{
	public void name()
	{
		System.out.println("This cat's name is MIMI");
	}
	void eat()
	{
		System.out.println("Cat eats fish");
	}
	void walk()
	{
		System.out.println("The animal walks by 4 legs");
	}
}
class Cat extends Animals implements Pet
{
	public void name()
	{
		System.out.println("This fish's name is MIMI");
	}
	void eat()
	{
		System.out.println("Fish eats plants");
	}
	void walk()
	{
		System.out.println("Fish has no legs");
	}
}
public class Interface_Inheritance
{
	public static void main(String[] args)
	{
		System.out.println("FISH");
		Fish ob1 = new Fish();
		ob1.name();
		ob1.eat();
		ob1.walk();
		System.out.println("\nCAT");
		Cat ob2 = new Cat();
		ob2.name();
		ob2.eat();
		ob2.walk();
		System.out.println("\nSPIDER");
		Spider ob3 = new Spider();
		ob3.eat();
		ob3.walk();
	}
}
