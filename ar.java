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
	int num=-1;
	for(int i=1;i<n-1;i++)
	{
		int dec=i-1,inc=i+1;
		while(dec>=0&&inc<=n-1)
		{
			if(a[i]>a[dec]&&a[i]<a[inc])
			{
				num=i;
			}
			else
			{
				break;
			}
			dec--;
			inc++;
		}
		if(num!=-1)
		{
			break;
		}
	}
	
	System.out.print(num);
	

}
}
