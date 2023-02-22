class A
{
 final int a = 10;
 void get()
 {
 a=a+10;
 System.out.println(a);
 }
}
class S
{
 public static void main(String[] args)
 {
 A obj = new A();
 obj.get();
 }
}
