import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
int n1=sc.nextInt();
String s1[]=new String[n1];
for(int i=0;i<n1;i++)
{
s1[i]=sc.next();
}
int n2=sc.nextInt();
String s2[]=new String[2];
for(int i=0;i<2;i++)
{
s2[i]=sc.next();
}
String a="";
for(int i=0;i<n1;i++)
{
	a+=s1[i];
}
int nl=n2-n1;
for(int i=0;i<nl;i++)
{
	a+=s1[i];
}
System.out.println(a);
int max=0;
for(int i=0;i<a.length();i++)
{
	int c=0;
	for(int j=i+1;j<a.length();j++)
	{
		if(a.charAt(i)==a.charAt(j))
		{
			c++;
		}
	}
	if(max<=c)
	{
		max=c;
		System.out.println((c+1)+"-"+a.charAt(i));
	}
	else
	{
		break;
	}
}	
}
}
