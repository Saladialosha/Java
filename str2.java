// odd positions
class str2
{
  public static void main(String[] args)
  {
  String s = "ALOSHA WELCOME";
  for(int i=0; i<s.length(); i++)
  {
  if(i%2!=0)
  {
   System.out.println(i+"  " +s.charAt(i));
  }
  }
  }
}