import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String a[]=new String[n];
String res[]=new String[n];
String d="";
for(int i=0;i<n;i++)
{
a[i]=sc.next();
}
Arrays.sort(a);
int k=0;
for(int i=0;i<n;i++)
{
	int c=0;
	for(int j=i+1;j<n;j++)
	{
		if(a[i].equals(a[j]))
		{
			c++;
		}
	}
	if(c>=1 && !(a[i].equals(d)))
	{
		res[k]=a[i];
		d=a[i];
		k++;
	}
}
for(int i=0;i<k;i++)
{
System.out.print(res[i]);
}
}
}