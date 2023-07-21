import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int a1[]=new int[n1];
int a2[]=new int[n2];
int l1=0,l2=0;
for(int i=0;i<n1;i++)
{
a1[i]=sc.nextInt();
}
for(int i=0;i<n2;i++)
{
a2[i]=sc.nextInt();
}
for(int i=0;i<n1;i++)
{
	int k=0;
	for(int j=0;j<n2;j++)
	{
		if(a1[i] == a2[j])
		{
		break;
		}
		else 
		{
			k++;
		}
	}
	if(k==n2)
	{
		l1+=1;
	}
}
for(int i=0;i<n2;i++)
{
int k1=0;
for(int j=0;j<n1;j++)
{
	if(a2[i] != a1[j])
	{
		k1++;
	}
}
if(k1==a1.length)
{
	l2+=1;
}
}
System.out.println(l1+l2);
}
}