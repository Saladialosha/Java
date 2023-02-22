import java.util.Scanner;
class decision2
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.println("enter first number");
int a = obj.nextInt();
System.out.println("enter second number");
int b = obj.nextInt();
System.out.println("enter third number");
int c = obj.nextInt();
if((a>b)&&(a>c))
{
System.out.println("fist is greatest");
}
else if((b>a)&&(b>c))
{
System.out.println("second is greatest");
}
else
{
System.out.println("third is greatest");
}
}
}