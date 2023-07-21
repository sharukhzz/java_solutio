import java.util.*;
class sharu
{
public static void main(String args[])
{
	//int t=3;
	double a[]={9,9.40,9.50,11,15,18};
	double b[]={9.10,12,11.20,11.30,19,20};
	int c=1;
		for(int j=0;j<b.length;j++)
		{
			for(int k=j+1;k<a.length;k++)
			{
				if(b[j] > a[k])
				{
				 c+=1;
				 break;
				}
				else
				{
					break;
				}
			}
	}
	System.out.print(c);
}
}
				
				 