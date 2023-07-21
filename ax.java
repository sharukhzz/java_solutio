import java.util.*;
class sharu
{
public static void main(String args[])
{
String s="rathinam";
char a[]=s.toCharArray();
int l=s.length();
ArrayList <Integer> d = new ArrayList<>();
ArrayList<Character> d1= new ArrayList<>();
ArrayList<String> d2=new ArrayList<>();
for (int i=0;i<l;i++)
{
int c=1;
for(int j=i+1;j<l;j++)
{
	if(a[i] == a[j])
	{
		c+=1;
		a[j]=' ';
	}
}
if(a[i] != ' ')
{
d.add(c);
d1.add(a[i]);
}
}
for(int i=0;i<d.size();i++)
{
	d2.add(Integer.toString(d.get(i))+d1.get(i));
}
Collections.sort(d2,Collections.reverseOrder());
for(int i=0;i<d.size();i++)
{
//System.out.print(d.get(i));
System.out.print(d2.get(i)+" ");
}
}
}

	
	