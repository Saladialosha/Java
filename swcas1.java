import java.util.Scanner;
class swcas1
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.println("enter first subject");
int m1 = obj.nextInt();
System.out.println("enter second subject");
int m2 = obj.nextInt();
System.out.println("enter third subject");
int m3 = obj.nextInt();
float avg = (m1+m2+m3)/3f;
if((m1>33) && (m2>33) && (m3>33) && (avg>40))
{
System.out.println("pass");
}
else
{
System.out.println("fail");
}
}
}