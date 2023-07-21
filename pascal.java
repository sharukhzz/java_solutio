import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ans=0;
for(int i=1;i<=n;i++)
{
	if(i==1)
	{
		ans=i;
		System.out.println(ans);
	}
	else{
	ans=ans*10+ans;
	System.out.println(ans);
	}
}
}
}
	
		