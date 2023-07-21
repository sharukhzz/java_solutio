import java.util.*;
class sharu
{
public static void main(String args[])
{
String s="abdc";
ArrayList <String> d = new ArrayList<>();
for(int i=0;i<s.length();i++)
{
String a="";
for(int j=i;j<s.length();j++)
{
	a+=s.charAt(j);
	System.out.println(a);
	d.add(a);
}
}
System.out.println(d.get(d.size()-1));
}
}
