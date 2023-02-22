import java.util.Scanner;
class plot
{
 float length,width;
plot()
{
 length = 0.0f;
 width = 0.0f;
}
plot(float l,float w)
{
 length = l;
 width = w;
}
plot(plot p)
{
 length = p.length;
 width = p.width;
}
float get()
{
{
 Scanner obj = new Scanner(System.in);
 System.out.println("Enter length,width");
 length = obj.nextfloat();
 length = obj.nextfloat();
}
}
float area()
{
 return area = length*width;
}
void display()
{
 System.out.println("length is = "+length);
 System.out.println("width is = "+width);
 System.out.println("area is = "+area);
}
}
class room extends plot
{
 float height;
 room()
 {
 super()
 height=0.0f;
 }
 room(float l, float w, float h)
 {
	 super(float l,float w)
	 height = h;
 }
 room(room r)
 {
	 
 }
}

