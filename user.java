import java.util.Scanner;
class user
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.println("enter first number = ");
String str1 = obj.nextLine();
System.out.println("enter second number = ");
String str2 = obj.nextLine();
String str3 = str1+ " loves " +str2;
System.out.println(str3);
}
}