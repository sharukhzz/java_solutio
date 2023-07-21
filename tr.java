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
		for(int j=i+1;j<n;j++)
		{
			if(i==0)
			{
				System.out.println(1);
			}
			if(a[i] > a[j])
			{
				System.out.println(1);
				break;
			}
			else if(a[i] < a[j])
			{
				int m=0,v=0;
				int r=0;
				r=a[j];
				int b=0;
				b=r;
				int ans=0;
				for(int k=0;k<n;k++)
				{
					if(a[k]==r)
					{
						ans=a[k];
						break;
					}
					else
					{
						r++;
					}
				}
				System.out.println("answer is:"+ans);
				for(int l=0;l<n;l++)
				{
					if(b==a[l])
					{
						v=l;
					}
					if(ans==a[l])
					{
						m=l;
					}
				}
				System.out.println("v and m is:"+v+m);
				System.out.println(m-v);
				break;
			}
		}
	}
}
}