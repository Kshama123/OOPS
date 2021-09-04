//WAP to demonstrate concept of class
class Employee
{
int empid;//Instance variable
String empname;//Instance variable
int salary;//Instance variable
public void setValue(int eid,String ename,int sal)//Instance Method
{
empid=eid;
empname=ename;
salary=sal;
}
public void display()
{
System.out.println("Employee Id="+empid);
System.out.println("Employee Name="+empname);
System.out.println("Employee Salary="+salary);
}
}
class ClassDemo2
{
public static void main(String[]args)
{
Employee e1=new Employee(); //Creation of object
e1.setValue(1001,"kshama sharma",40000);
e1.display();
Employee e2=new Employee();
e2.setValue(1002,"kshama pandit",45000);
e2.display();
}
}