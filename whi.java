import java.util.Scanner;
class whi
{
public static void main(String[] arg)
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter number");
int num = obj.nextInt();
int out=0, rem;
while(num>0)
{
rem = num%10;
out = out*10+rem;
num = num/10;
}
System.out.println(out);
}
}