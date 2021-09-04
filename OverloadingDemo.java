import java.util.*;
class Figure
{
public int area(int s)//Area of square
{
return(s*s);
}
public int area(int l,int b)//Are of rectangle
{
return(l*b);
}
public double area(float r)//Area of circle
{
return(3.14*r*r);
} 
}
class OverloadingDemo
{
public static void main(String[] args)
{
int s,l,b,a1,a2;
float r;
double a3;
Scanner sc=new Scanner(System.in);
System.out.print("Enter side of square :");
s=sc.nextInt();
System.out.print("Enter length and breadth of rectangle");
l=sc.nextInt();
b=sc.nextInt();
System.out.print("Enter radius of circle");
r=sc.nextFloat();
Figure fig=new Figure();
a1=fig.area(s);
a2=fig.area(l,b);
a3=fig.area(r);
System.out.println("Area of square= "+a1);
System.out.println("Area of rectangle= "+a2);
System.out.println("Area of circle= "+a3);
}
}