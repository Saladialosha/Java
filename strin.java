import java.util.Scanner;                 
class strin
{
public static void main(String[] args)
{
char[]a={'a','l','o','s','h','a'};
byte[]b={65,92,95,82,69,72};
String s1 = new String(a);
System.out.println(s1);
String s2 = new String(a, 1,5);
System.out.println(s1);
String s3 = new String(s1);
System.out.println(s3);
String s4 = new String(b);
System.out.println(s4);
String s5 = new String(b, 4,4);
System.out.println(s5);
}
}