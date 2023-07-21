import java.util.*;
class sharu
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]);
		for(int j=i+1;j<n;j++)
		{
			System.out.println(a[i]+" "+a[j]);
			for(int k=j+1;k<n;k++)
			{
			System.out.println(a[i]+" "+a[j]+" "+a[k]);
			}
		}
	}
}
}