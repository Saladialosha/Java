//string buffer
class strbuff
{
public static void main(String[] args)
{
String s="hello";
s.concat("student");
System.out.println(s);

// mutable string
StringBuffer s1= new StringBuffer("LPU");
s1.append("STUDENTS");
System.out.println(s1);

// replace(start_index, end_index)
s1.replace(1,3, "ECE");
System.out.println(s1);

//insert(Start_index, charseq)
s1.insert(2, "CSE");
System.out.println(s1);

//delete(start_index, end_index)
s1.delete(1,5);
System.out.println(s1);

//reverse
s1.reverse();
System.out.println(s1);

//capacity -> 16characters
StringBuffer s2= new StringBuffer();
System.out.println(s2.capacity());
s2.append("LPU");
System.out.println(s2.capacity());
s2.append("This is a string with leading and trailing spaces.");
System.out.println(s2.capacity());

//ensurecapacity
StringBuffer s3= new StringBuffer();
System.out.println(s3.capacity());
s3.ensureCapacity(10);
System.out.println(s3.capacity());
}
}