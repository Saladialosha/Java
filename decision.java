import java.util.Scanner;
class decision
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.println("enter number");
int n = obj.nextInt();
if(n%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}