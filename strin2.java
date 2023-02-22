//modification of string
//substring(start_index)
//substring(start_index,end_index)
//and replace()

class strin2
{
public static void main(String[] args)
{
String S="now it is time";
String t = S.substring(2);
System.out.println(t);
String w = S.substring(2,5);
System.out.println(w);
String k = S.replace('t','w');
System.out.println(k);

//trim fn-->delete the leading and trailing white spaces
String U="    HHHHH      ";
String L=U.trim();
System.out.println(L);

// join fn-> used to join multiple strings
// join("char sequence delimter, string");
String join1=String.join("-","have","kk","is");
System.out.println(join1);

//tolowercase() and touppercase()
System.out.println(U.toLowercase());
}
}