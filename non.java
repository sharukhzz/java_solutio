import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String res="";
for(int i=0;i<s.length();i++)
{
for(int k=i+1;k<s.length();k++)
{
if(s.charAt(i) == s.charAt(k))
{
	res+=s.charAt(i);
}
}
	int c=0;
	for(int j=0;j<res.length();j++)
	{
	if(s.charAt(i) == res.charAt(j))
	{
		c++;
	}
	}
	if(c==0)
	{
	System.out.println(s.charAt(i));
	break;
	}
}
}
}
