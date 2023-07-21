import java.util.*;
class sharu
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	int n=sc.nextInt();
	int c=0;
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				if ( a[i] + a[j] + a[k] <= m)
				{
					System.out.println(a[i]+" "+a[j]+" "+a[k]);
					c++;
				}
			}
		}
	}
	System.out.print(c);
}
}