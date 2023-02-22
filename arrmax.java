import java.util.Scanner;
class arrmax
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter size");
int size = obj.nextInt();
int a[] = new int[size];
System.out.println("Enter element");
for(int i=0;i<a.length;i++)
{
	a[i] = obj.nextInt();
}
int max = a[0];
for(int i=1;i<a.length;i++)
{
if(a[i]>max)
max = a[i];
}
System.out.println(max);
}
}