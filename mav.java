import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
//char a[]=s.toCharArray();
String t=sc.nextLine();
//char b[]=t.toCharArray();
for(int i=0;i<s.length();i++)
{
		if(s.contains(t))
		{
			s=s.replaceFirst(t,"");
			break;
		}
}
System.out.println(s);
}
}