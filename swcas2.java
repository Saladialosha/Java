import java.util.Scanner;
class swcas2
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.println("enter string ");
String str = obj.next();
switch(str)
{
case "ALO":
System.out.println("this is ALO class");
break;
case "ALOS":
System.out.println("this is ALOS class");
break;
case "ALOSH":
System.out.println("this is ALOSH class");
break;
case "ALOSHA":
System.out.println("this is ALOSHA class");
break;
default:
System.out.println("NO class");
}
}
}