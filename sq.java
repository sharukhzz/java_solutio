import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
int m=n-1;
System.out.println(m);
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
	if(i==0 || i==m || j==0 || j==m || i==j || i+j==m)
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
	
	