import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
	if(i==n-1 || i==0 || j==n-1 || j==0)
	{
		System.out.print("*");
	}
	else if(i==j && i!=n/2)
	{
		System.out.print("*");
	}
	else if(i+j==n-1 && i!=j)
	{
		System.out.print("*");
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
			