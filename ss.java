import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String ar[]=new String[n];
for(int i=0;i<n;i++)
{
ar[i]=sc.next();
}
int c=0;
/*for(int i=0;i<n;i++)
{
	String a=ar[i];
	for(int j=i+1;j<n;j++)
	{
		String b=ar[j];
		for(int k=0;k<a.length();k++)
		{
			for(int l=0;l<b.length();j++)
			{
				if(a.charAt(k) == b.charAt(l))
				{
					break;
				}
			}
		}
	}
}*/
int max=0;
for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
		String s="";
		s=ar[i]+ar[j];
		System.out.println(s);		
		for(int p=0;p<s.length();p++)
		{
			int k=0;
			for(int q=i+1;q<s.length();q++)
			{
				if(s.charAt(p) != s.charAt(q))
				{
					k++;
				}
			}
			System.out.println(k);
			String y="";
			if(k==s.length()-1)
			{
				y=s;
				System.out.println(y);
				if(max<y.length())
				{
					max=y.length();
				}
			}
		}
	}
}
System.out.println(max);
}
}