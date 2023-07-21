import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=0;
int sq[]=new int[n/2];
for(int i=1;i<n/2;i++)
{
	sq[i]=i*i;
}
for(int i=0;i<sq.length;i++)
{
	if(n==sq[i]*sq[i])
	{
		c=2;
		break;
	}
	for(int j=0;j<sq.length;j++)
	{
	if(n==sq[i]*j)
	{
		c=j;
		break;
	}
	else if(n==sq[i]+sq[j])
	{
		c=2;
		break;
	}
	else if(n==sq[i]+sq[j]+sq[j])
	{
		c=3;
		break;
	}
	}
}
System.out.println(c);
}
}