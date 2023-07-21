import java.util.*;
class sharu
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	/*char nuts[]=new char[n];
	char bold[]=new char[n];
	for(int i=0;i<n;i++)
	{
		nuts=sc.next().toCharArray(i);
	}
	for(int i=0;i<n;i++)
	{
		bold=sc.next().toCharArray(i);
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(nuts[i]);
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(nuts[i]);
	}*/
	char nuts[]={'@','%','$','#','^'};
	char bold[]={'%','@','#','$','^'};
	char res[]={'!','#','$','%','&','*','@','^','~','.'};
	int x=0;
	char ans[]=new char[n];
	char ans1[]=new char[n];
	for(int i=0;i<res.length;i++)
	{
		for(int j=0;j<nuts.length;j++)
		{
			if(res[i]==nuts[j])
			{
			for(int k=0;k<bold.length;k++)
			{
				if(nuts[j]==bold[k])
				{
					ans[x]=res[i];
					ans1[x]=res[i];
					System.out.println(res[i]);
					System.out.println(res[i]);
				}
			}
			}
		}
	}
	/*for(int i=0;i<ans.length;i++)
	{
		System.out.println(ans[i]);
	}
	for(int i=0;i<ans.length;i++)
	{
		System.out.println(ans1[i]);
	}*/
	
}
}
	