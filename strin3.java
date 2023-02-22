class strin3
{
public static void main(String[] args)
{
String str = "hello world";
char[] charArray = str.toCharArray();

char oldChar = 'o';
char newChar = 'a';

for (int i = 0; i < charArray.length; i++) {
    if (charArray[i] == oldChar) {
        charArray[i] = newChar;
    }
}

String newStr = new String(charArray);
System.out.println(newStr);
}
}