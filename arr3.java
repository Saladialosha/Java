import java.util.Scanner;
class arr3
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
int a[] = new int[5];
System.out.println("Enter element");
for(int i=0;i<5;i++)
{
a[i] = obj.nextInt();
}
for(int i=0;i<5;i++)
{
System.out.println(a[i]);
}
}
}