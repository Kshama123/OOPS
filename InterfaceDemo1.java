//This program will demonstrate concept of interface
interface MyInterface
{
void m1();//public abstract void m1();
void m2();//public abstract void m2();
}
class TestInterface implements MyInterface
{
public void m1()
{
System.out.println("This message from m1");
}
public void m2()
{
System.out.println("This message from m2");
}
}
class InterfaceDemo1
{
public static void main(String[] args)
{
TestInterface ts=new TestInterface();
ts.m1();
ts.m2();
}
}