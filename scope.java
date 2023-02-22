import java.util.Scanner;
class scope
{
public static void main(String[] args)
{
int x;
x = 13;
if(x==13)
{
int y = 25;
x = y*2;
}
System.out.println(x);
}
}