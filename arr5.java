import java.util.Scanner;
class arr5
{
public static void main(String[] args)
{
int a[][] = new int[3][3];
a[0][0] = 20;
a[0][1] = 40;
a[0][2] = 60;
a[1][0] = 10;
a[1][1] = 30;
a[1][2] = 50;
a[2][0] = 70;
a[2][1] = 80;
a[2][2] = 90;
for(int i=0;i<a.length;i++)
for(int j=0;j<a.length;j++)
System.out.println(a[i][j]);
}
}