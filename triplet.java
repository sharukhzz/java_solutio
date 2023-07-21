import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int nums[]=new int[n];
int res[]=new int[3];
for(int i=0;i<n;i++)
{
	nums[i]=sc.nextInt();
}
int diff=0,o=0;
 for(int i=0; i<n; i++){
        
        for(int j=i+1; j<n;j++){
            
            for(int k = j+1; k<n ; k++){
                
                if((nums[k] - nums[j] == 0 )&& (nums[j] - nums[i] == 0)) {
				System.out.println(nums[i]+nums[j]+nums[k]);
                }
            }
        }
    }
}
}