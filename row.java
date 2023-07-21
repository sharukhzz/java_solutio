import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
String s[]=new String [7];
int v[]=new int[7];
for(int i=0;i<s.length;i++)
{
	s[i]=sc.next();
}
for(int i=0;i<v.length;i++)
{
	v[i]=sc.nextInt();
}
//ArrayList <Integer> d=new ArrayList<>();
StringBuilder d=new StringBuilder();
for(int i=0;i<7;i++)
{
while(num >= v[i])
{
		num-=v[i];
		d.append(s[i]);
}
}
System.out.println(d);
}
}
	