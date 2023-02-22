import java.util.Scanner;
class decision1
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.println("enter number");
int n = obj.nextInt();
if(n>0)
{
if(n%2==0)
{
System.out.println("positive even");
}
else
{
System.out.println("positive odd");
}
}
else
{
if(n%2==0)
{
System.out.println("negative even");
}
else
{
System.out.println("negative odd");
}	
}
}
}