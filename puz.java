import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ans=0;
int a[]=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
/*for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
	if(a[i] != a[j])
	{
		ans=i;
		break;
	}
}
}*/
System.out.println(ans);
}
}
	