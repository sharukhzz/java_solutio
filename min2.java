import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int a[]=new int[t];
for(int i=0;i<t;i++)
{
	a[i]=sc.nextInt();
}
int l1=a[0];
int l2=a[1];
for(int i=0;i<t;i+=2)
{
	if(a[i]<l1)
	{
		l1=a[i];
	}
	else if(a[i+1]<l2)
	{
		l2=a[i+1];
	}
}
if(l1<l2)
{
System.out.println(l1);
System.out.println(l2);
}
else
{
System.out.println(l2);
System.out.println(l1);
}
}
}