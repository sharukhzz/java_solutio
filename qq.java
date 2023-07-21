import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
PriorityQueue <String> t=new PriorityQueue<String>();
PriorityQueue <String> t1=new PriorityQueue<String>();
t.add("blue");
t.add("red");
t.add("green");
t.add("yellow");
t1.add("blue");
t1.add("red");
t1.add("yellow");
t1.add("green");
/*Iterator <String>it=t.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}*/
for(String el:t)
{
System.out.println(t1.contains(el) ? el : false);	
}
}
}