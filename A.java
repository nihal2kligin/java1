class TestClass
{
public  int num=100;
public  void printMessage(){System.out.println("Hello java");}
}
public class A
{
public static void main(String args[])
{
TestClass obj=new TestClass();
System.out.println(obj.num);
obj.printMessage();
}
}
