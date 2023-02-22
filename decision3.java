import java.util.Scanner;
class decision3
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.println("enter string ");
char ch = obj.next().charAt(3);
System.out.println(ch);
if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u') ||(ch=='A') || (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U'))
{
System.out.println("enter char is vowel ");
}
else
{
System.out.println("enter char is consonent ");
}
}
}