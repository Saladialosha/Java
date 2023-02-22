import java.lang.String;
class str
{
  public static void main(String[] args)
  {
  String S1 = "Welcome";
  char ch[]={'W', 'e', 'l', 'c', 'o', 'm', 'e'};
  String S2 = new String(ch);
  String S3 = new String("welcome");
  S1 = S1.concat("Alosha");
  System.out.println(S1 +" "+S2 +" "+S3);
  }
}