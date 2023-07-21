// 4 3 7 8 6 2 1
// 3 7 4 8 2 6 1
import java.util.*;
class sharu
{
public static void main(String args[])
{
int a[]={4,3,7,8,6,2,1};
int res[]=new int[a.length];
for (int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
	if(i%2!=0)
	{
		if(a[i]<a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		break;
	}
	else
	{
		if(a[i]>a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		break;
	}
}
}
for (int i=0;i<res.length;i++)
{
	System.out.print(a[i]+" ");
}
}
}
