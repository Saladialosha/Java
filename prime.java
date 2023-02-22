import java.util.Scanner;
class prime
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter number");
int num = obj.nextInt();
int i, flag=0;
if((num==1)||(num==2))
System.out.println("Prime number");
for(i=2;i<=num-1;i++)
{
if(num%i==0)
{
flag = 1;
break;
}
}
if(flag==0)
{
System.out.println("Prime number");	
}
else
System.out.println(" not a Prime number");		
}
}