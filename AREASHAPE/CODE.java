import java.util.*;
abstract class shape
{
	abstract void printarea();
}
class Rectangle extends shape
{
	Double length,breadth,area;
	Scanner s=new Scanner(System.in);
	Rectangle()
	{
		System.out.println("Enter the dimensions for rectangle:");
		length=s.nextDouble();
		breadth=s.nextDouble();
	}
	void printarea()
	{
		area=length*breadth;
		System.out.println("Area is "+area);
	}
}
class Triangle extends shape
{
	Double height,base,area;
	Scanner s=new Scanner(System.in);
	Triangle()
	{
		System.out.println("Enter the dimensions for triangle:");
		height=s.nextDouble();
		base=s.nextDouble();
	}
	void printarea()
	{
		area=0.5*base*height;
		System.out.println("Area is "+area);
	}
}
class Circle extends shape
{
	Double radius,area;
	Scanner s=new Scanner(System.in);
	Circle()
	{
		System.out.println("Enter the radius:");
		radius=s.nextDouble();
	}
	void printarea()
	{
		area=3.14*radius*radius;
		System.out.println("Area is "+area);
	}
}
class Area
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Circle c=new Circle();
		r.printarea();
		t.printarea();
		c.printarea();
		System.out.println("LIKITH.TARAKARAM");
		System.out.println("1BM23CS171");
	}
}
						
