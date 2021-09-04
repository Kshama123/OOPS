//WAP to demonstrate concept of method overriding
class X
{
public void m1()
{
System.out.println("m1 of X");
}
public void m2()
{
System.out.println("m2 of X");
}
}
class Y extends X
{
public void m1()
{
System.out.println("m1 of Y");
}
public void m3()
{
System.out.println("m3 of Y");
}
}
class OverridingDemo
{
public static void main(String[] args)
{
X x1=new X();
x1.m1();
x1.m2();
Y y1=new Y();
y1.m1();
y1.m2();
y1.m3();
}
}