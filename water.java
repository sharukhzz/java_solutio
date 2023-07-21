import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum[]=new int[n];
int a[]=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
	int c=0;
	for(int j=i+1;j<n;j++)
	{
		if(i==j-1)
		c=0;
		else
		c++;
	}
	sum[i]=a[i]*c;
}
for(int i=0;i<n;i++)
{
System.out.println(sum[i]);
}
Arrays.sort(sum);
System.out.println("max : "+sum[n-1]);
}
}