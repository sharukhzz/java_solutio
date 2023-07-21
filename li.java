import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("do you want to continue:");
int b=sc.nextInt();
do
{
int n=sc.nextInt();
int flag=0;
for(int i=1;i<n;i++)
{
	int k=0,l=0,o=0;
	l=i*i;
	int d=i;
	o=n-l;
	for(int j=1;j<n;j++)
	{
	int ans=1;
	for(int p=0;p<j;p++)
	{
	ans*=j;
	}
	k=j;
	if(ans==o && ans>0)
	{
	System.out.println("d is"+d);
	System.out.println("k is"+k);
	System.out.println("result is "+ans);
	flag=1;
	break;
	}
	}
}
if(flag==0)
{
	System.out.println("no");
}
else
{
	System.out.println("yes");
}
}
while(b==1);
}
}