// frequency of element
class str3
{
  public static void main(String[] args)
  {
  String s = "ALOSHA";
  int count = 0;
  for(int i=0; i<s.length(); i++)
  {
  if(s.charAt(i) == 'A')
  {
  count++;
  }
  }
  System.out.println(count);
  }
}