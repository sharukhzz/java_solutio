import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]={20,30,40,50,2,3,14};
int sum=0;
for(int i=0;i<a.length;i++)
{
	if(a[i]>17 && a[i]<40)
	{
		sum+=400;
	}
	else if(a[i]<=17)
	{
		sum+=200;
	}
	else if(a[i]>=40)
	{
		sum+=300;
	}
}
System.out.println(sum);
}
}