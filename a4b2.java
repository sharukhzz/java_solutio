import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String ans="";
int p=0;
char a[]=s.toCharArray();
for(int i=0;i<a.length;i++)
{
	int c=1;
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]==a[j])
		{
			c++;
			a[j]=' ';
		}
		else
		{
			break;
		}
	}
	if(a[i]!=' ')
	{
	ans=ans+a[i]+c;
	}	
}
System.out.println(ans);
}
}