/*
String str = "  This is a string with leading and trailing spaces.   ";
str = str.replaceAll("^\\s+", "");
str = str.replaceAll("\\s+$", "");
System.out.println(str);
*/


class strin4
{
public static void main(String[] args)
{
String s = " Hello world ";
char ch[] = s.toCharArray();
int start = 0, end = 0, i;
for(i=0; i<ch.length;i++)
{
	if(ch[i] == ' ')
		continue;
	else
	{
		start = i;
		break;
	}
}

for(i=0; i<ch.length-1;i++)
{
	if(ch[i] == ' ')
		continue;
	else
	{
		end = i;
		break;
	}
}
for(i=start; i<=end; i++)
{
	System.out.println(ch[i]);
}
}
}


	