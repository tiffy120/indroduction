Aim:Create an Arithmetic package that has classes and interfaces for the 4 basic
arithmeticoperations. Test the package by implementing all operations on two
given numbers

java main code:

import graphics.*;
class FigureTest
{
public static void main(String args[])
{
 Circle c=new Circle();
 c.area(6,0);
 Rectangle r=new Rectangle();
 r.area(3,6);
 Triangle t=new  Triangle();
 t.area(5,6);
 square s=new square();
 s.area(2,0);
}
}
package graphics;
interface Graphics
{
	public float area(float x,float y);
}
class Square implements Graphics
{
	public float area(float x,float y)
	{
		return(x*x);
	}
}
class Rectangle implements Graphics
{
	public float area(float x,float y)
	{
		return(x*y);
	}
}
class Triangle implements Graphics
{
	public float area(float x,float y)
	{
		return((x*y)/2);
	}
}
class Circle implements Graphics
{
	public float area(float x,float y)
	{
		return(3.14*x*x);
	}
}