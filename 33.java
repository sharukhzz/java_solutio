import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
if(n%2!=0)
{
	a[0]=n;
	int x=1;
	for(int i=1;i<n;i++)
	{
		a[i]=x;
		a[i+1]=x*-1;
		i=i+1;
		x++;
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}
else
{
	a[0]=0;
	a[1]=n;
	int x=1;
	for(int i=2;i<n;i++)
	{
		a[i]=x;
		a[i+1]=x*-1;
		i=i+1;
		x++;
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}	
}
}