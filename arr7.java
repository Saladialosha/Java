import java.util.Scanner;
class arr7
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter size");
int size = obj.nextInt();
int a[] = new int[size];
System.out.println("Enter element");
for(int i:a)
{
	a[i] = obj.nextInt();
}
int sum = 0;
for(int i:a)
{
sum = sum+a[i];
}
System.out.println(sum);
}
}