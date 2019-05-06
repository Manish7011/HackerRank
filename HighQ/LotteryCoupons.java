/*
 Count occurrence of total number of winners.
 
*/


import java.util.Scanner;
public class LotteryCoupons{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		System.out.println(run(value));
	}
	
	public static int run(int n){
		int ans = 0, sum=0, temp=0,max=0;
        int counter[] = new int[n+1];
        for(int tt=1;tt<=n;tt++){
            temp = tt;
			sum=0;
            for(int i=tt;i>0;sum+=i%10,i/=10);
            counter[sum] += 1;
            if(max < counter[sum]){
                ans = 1;
				max = counter[sum];
            }else if(max == counter[sum]){
                ans++;
            }
        }
        return ans;
	}
}