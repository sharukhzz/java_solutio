import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int flag=sc.nextInt();
int n=sc.nextInt();
int a[][]=new int[n][n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
	a[i][j]=sc.nextInt();
}
}
if(flag==1 && n==3)
{
for(int i=0;i<n;i++)
{
	for(int j=i;j<n;j++)
	{
		int temp=a[i][j];
		a[i][j]=a[j][i];
		a[j][i]=temp;
	}
}
for(int i=0;i<n;i++)
{
	for(int j=n-1;j>=0;j--)
	{
		System.out.print(a[i][j]);
	}
	System.out.println();
}
}
if(flag==0 && n==3)
{
for(int i=0;i<n;i++)
{
	for(int j=i;j<n;j++)
	{
		int temp=a[i][j];
		a[i][j]=a[j][i];
		a[j][i]=temp;
	}
}	
for(int j=0;j<n;j++)
{
for(int i=n-1;i>=0;i--)
{
	System.out.print(a[i][j]);
	System.out.println();
}
}
}
if(flag==0 && n==2)
{
	for(int i=0;i<n;i++)
	{
		int j=0;
			if(i==j)
			{
				int temp=a[i][j];
				a[i][j]=a[i+1][j+1];
				a[i+1][j+1]=temp;
			}
	}
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)
	{
		System.out.print(a[i][j]);
	}
	System.out.println();
	}
}
}
}