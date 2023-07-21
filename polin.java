import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int i=0;
int l=5;
System.out.println(s.length());
int u=0;
for(int i=u;i<s.length()/2;i++)
{
for(int j=l;j>2;j--)
{
	s1+=s.charAt(j);
}
for(int k=0;k<3;k++)
{
	s2+=s.charAt(k);
}
}
u=l+1;
System.out.println(s1);
System.out.println(s2);
if(s1.equals(s2))
{
System.out.println("true");
}
else
{
System.out.println("false");
}
}
}