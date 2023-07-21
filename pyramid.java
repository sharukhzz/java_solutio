import java.util.*;
class sharu
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int length=a.length();
		if(length%2==0)
		{
			/*for(int i=0;i<length;i++)
			{
				System.out.print(" ");
			}*/
			for(int i=1;i<=length;i++)
			{
				for(int j=1;j<=length-i;j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
			System.out.print("\n");
			}
			for(int i=0;i<length;i++)
			{
				System.out.print("*");
			}
			System.out.print(""+a);
			for(int i=0;i<length;i++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			for(int i=0;i<length;i++)
			{
				System.out.print(" ");
			}
			for(int i=0;i<length;i++)
			{
				System.out.print("*");
			}
		}
	}
}