import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]={5,7,1,2,8,4,3};
int flag=0;
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]!=a[j])
		{
			int sum=0;
			sum=a[i]+a[j];
			if(sum==n)
			{
				flag=1;
				System.out.println(a[i]+"+"+a[j]+"="+sum);
			}
		}
	}
}
}
}