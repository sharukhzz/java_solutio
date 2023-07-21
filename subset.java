import java.util.*;
class sharu
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	int l=a.length;
	int sol[]=new int[l];
	int i=0;
	subset(a,n,i,sol);
}
static void subset(int a[],int n,int i,int sol[])
{
	if(i==n)
	{
	for(int j=0;j<sol.length;j++)
	{
	if(sol[j]==1)
	{
	System.out.print(a[j]);
	}
	}
	System.out.println();
	}
	else
	{
	sol[i]=1;
	subset(a,n,i+1,sol);
	sol[i]=0;
	subset(a,n,i+1,sol);	
	}
}	
}	