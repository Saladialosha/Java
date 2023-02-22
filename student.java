import java.util.Scanner;
class student
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.println("enter first subject = ");
int a = obj.nextInt();
System.out.println("enter second subject = ");
int b = obj.nextInt();
System.out.println("enter third subject = ");
int c = obj.nextInt();
System.out.println("enter fourth subject = ");
int d = obj.nextInt();
System.out.println("enter fifth subject = ");
int e = obj.nextInt();
System.out.println("enter six subject = ");
int f = obj.nextInt();
int g = (a+b+c+d+e+f);
float per = (g/6)*100;
System.out.println(per);
}
}