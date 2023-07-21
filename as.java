import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
int res=0;
for(int i=0;i<n;i++)
{
for(int j=0;j<n+2;j++)
{
	if(i==j)
	{
		System.out.print(0);
	}
	else if(j==0)
	{
		System.out.print(i);
	}
	else if(j<i)
	{
		System.out.print(j);
	}
	else if(i==1&&j==2 || i==2&&j==3 || i==2&&j==4)
	{
	if(j>i)
	{
		System.out.print(j-i);
	}
	}
	else
	{
		System.out.print(" ");
	}
}
System.out.println();
}
}
}