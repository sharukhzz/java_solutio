import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s1="",s2="";
int l=s.length();
int i2=0;
for(int i=0;i<l;i++)
{
	if(i==3)
	{
	i2=i;
	break;
	}
	else
	{
	s1+=s.charAt(i);
	}
}
System.out.println(s1);
for(int i=l-1;i>=i2;i--)
{
	s2+=s.charAt(i);
}
System.out.println(s2);
if(s1.equals(s2))
{
System.out.println("collindrome");
}
else
{
System.out.println("not a collindrome");
}
}
}
	