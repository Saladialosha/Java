class A
{
 int a = 10;
 final void get()
 {
 a=a+10;
 System.out.println(a);
 }
}
class B extends A
{
 void get()
 {
 a=a+10;
 System.out.println(a);
 }
}
class S1
{
 public static void main(String[] args)
 {
 B obj = new B();
 obj.get();
 }
}