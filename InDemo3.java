//WAP to Multilevel Inheritance
class A
{
public void showA()
{
System.out.println("This message from class A");
}
}
class B extends A
{
public void showB()
{
System.out.println("This message from class B");
}
}
class C extends B
{
public void showC()
{
System.out.println("THis message from class C");
}
}
class InDemo3
{
public static void main(String[] args)
{
C c=new C();
c.showA();
c.showB();
c.showC();
}
}