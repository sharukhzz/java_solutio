import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int max=0;
int FLAG=1;
for(int i=a;i<b;i++)
{
	for(int j=2;j<b;j++)
	{
	if(i%j==0)
	{
		FLAG=0;
	}
	else
	{
		FLAG=1;
	}
	}
	if(FLAG==1)
	{
	System.out.println(i);
	if(max<i)
	{
		max=i;
	}
	}
}
//System.out.println(max);
}}
		