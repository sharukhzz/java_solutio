import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char c[]=s.toCharArray();
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
	{
		c[i]=Character.toUpperCase(c[i]);
	}
}
for(int i=0;i<s.length();i++)
{
System.out.print(c[i]);
}
}
}