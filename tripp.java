import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sum=0;
int c=0;
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
for(int k=j+1;k<a.length;k++)
{
	if(a[i]+a[j]+a[k]==sum)
	{
		c++;
		System.out.println(a[i]+" "+a[j]+" "+a[k]);
	}
}
}
}
//System.out.println(c);
}
}