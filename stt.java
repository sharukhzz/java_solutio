import java.util.*;
class sharu
{
public static void main(String args[])
{
String s="dadccda";
String a="";
int min=s.length();
char t=0;
for(int i=0;i<s.length();i++)
{
int c=0,co=0;
a+=s.charAt(i);
for(int k=0;k<a.length();k++)
{
	for(int l=i+1;l<a.length();l++)
	{
		if(s.charAt(k) == s.charAt(l))
		{
			co++;
		}
	}
}
if(co==a.length()-1)
{	
for(int j=i+1;j<s.length();j++)
{
	if(s.charAt(i)==s.charAt(j))
	{
		c++;
	}
}
	System.out.println("a"+c);
	if(c < min)
	{
		min=c;
		System.out.println(min);
		t=s.charAt(i);
		//System.out.println(t);
	}
}
}
}
}