import java.util.Scanner;
class arr4
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
int a[] = new int[5];
System.out.println("Enter element");
for(int i=0;i<a.length;i++)
{
a[i] = obj.nextInt();
}
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}