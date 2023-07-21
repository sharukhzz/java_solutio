import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int nums[]=new int[n];
for(int i=0;i<nums.length;i++)
{
nums[i]=sc.nextInt();
}
int k=sc.nextInt();
/*int i=0,j=k;
int subarr[]=Arrays.copyOfRange(nums,i,k);
int l=0;
int max[]=new int[nums.length];
for(int s=0;s<subarr.length;s++)
{
	Arrays.sort(subarr);
	max[l]=subarr[subarr.length-1];
	i++;
	j++;
}*/
//int max[]=new int[nums.length];
ArrayList <Integer> d = new ArrayList<>();
int r=nums.length-k;
int x=0;
int max=0;
for(int i=0;i<r;i++)
{
	x=i;
	max=nums[i];
	for(int j=0;j<k;j++)
	{
		if(max<nums[x])
		{
			max=nums[x];
		}
	x++;
	}
	System.out.println(max);
}
}
}