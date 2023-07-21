import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
int c=0;
for(int i=0;i<s1.length();i++)
{
for(int j=0;j<s2.length();j++)
{
	if(s1.charAt(i)==s2.charAt(j))
	{
		c++;
	}
}
}
if(c==s1.length())
{
System.out.println("anagram");
}
else
{
System.out.println("not a anagram");
}
}
}