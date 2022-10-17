import java.util.Scanner;
class Method_Overloading
{
	void area(double l,double b)
	{
		System.out.println("Area of Triangle is: "+(0.5*l*b));
	}
	void area(int l,int b)
	{
		System.out.println("Area of Rectangle is: "+(l*b));
	}
	void area(double r)
	{
		System.out.println("Area of Circle is: "+(3.14*r*r));
	}
}
public class area
{
	public static void main(String[] args)
	{
		int l,w;
		double b,h,r;
		Scanner in = new Scanner(System.in);
		Method_Overloading ob=new Method_Overloading();
		System.out.println("Enter base and height of triangle");
		b=in.nextDouble();
		h=in.nextDouble();
		ob.area(b,h);
		System.out.println("Enter length and breadth of rectangle");
		l=in.nextInt();
		w=in.nextInt();
		ob.area(l,w);
		System.out.println("Enter the radius of the circle");
		r=in.nextDouble();
		ob.area(r);
		
	}
}