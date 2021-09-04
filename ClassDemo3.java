//WAP to demonstrate concept of constructor
import java.util.*;
class Rectangle
{
int l,b;//Instance Variables
Rectangle(int x,int y)//Constructor
{
l=x;
b=y;
}
public int area()
{
return(l*b);
}
}
class ClassDemo3
{
public static void main(String[] args)
{
int x,y,a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter length and breadth of rectangle");
x=sc.nextInt();
y=sc.nextInt();
Rectangle r=new Rectangle(x,y);
a=r.area();
System.out.println("Area of rectangle="+a);
}
}