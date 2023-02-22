import java.util.Scanner;
class jaggedarr
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
int a[][] = new int[3][];
int a[0][0] = new int[3];
int a[1][1] = new int[2];
int a[2][2] = new int[4];
int count = 0;
System.out.println("Enter element");
for(int i=0;i<a.length;i++)
{
	a[i] = obj.nextInt();
}
for(int j=0;j<a[i].length;j++)
{
	a[j] = obj.nextInt();
}
a[i][j] = count++;
for(int i=0;i<a.length;i++)
for(int j=0;j<a[i].length;j++)
System.out.println(a[i][j]);
}
}