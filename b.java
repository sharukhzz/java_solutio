import java.util.*;
class sharu
{
public static void main(String args[])
{
	int a[]={8,4,2,1};
	int c=0;
	for(int i=0;i<a.length;i++)
	{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]>a[j])
		{
		 int temp=a[i];
		 a[i]=a[j];
		 a[j]=temp;
		 c++;
		 }
	}
	for(int k=0;k<a.length;k++)
	{
		System.out.print(a[k]+" ");
	}
	System.out.println();
	}
	System.out.print(c);
}
}