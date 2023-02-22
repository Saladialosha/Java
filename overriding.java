// method overriding
class A
{
void show()
{
System.out.println("base class");
}
}
class B extends A
{
void show()
{
	super.show();
System.out.println("derived class");
}
}
class overriding
{
public static void main(String[] args)
{
B obj1 = new B();
obj1.show();
}
}



