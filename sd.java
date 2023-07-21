import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int k=sc.nextInt();
int n=s.length();
String v="aeiou";
int c[]=new int[n];
int i=0,j=k-1,g=0;
while(i<n-k || j<n)
{
	String s1="";
	for(int t=i;t<=j;t++)
	{
		s1+=s.charAt(t);
	}
	System.out.println(s1);
	int p=0;
	for(int l=0;l<s1.length();l++)
	{
	if(s1.charAt(l)=='a' || s1.charAt(l)=='e' || s1.charAt(l)=='i' || s1.charAt(l)=='o' || s1.charAt(l)=='u')
	{
		p++;
	}
	}
	c[g]=p;
	i++;
	j++;
	g++;
}
//c=c.trim();
for(int d=0;d<c.length;d++)
{
	System.out.println(c[d]);
}
Arrays.sort(c);
System.out.println("the answer is "+c[c.length-1]);
}
} 		