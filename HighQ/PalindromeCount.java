/*
 Count occurrence of palindrom substring in given string.
 
 tacocat -> t a c o c a t coc acoca tacocat -> 9
*/


import java.util.Scanner;
public class PalindromeCount{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		System.out.println(run(value));
	}
	
	public static int run(String value){
		int ans=0, len=0;
		StringBuilder sb = null;
		StringBuilder rev = null;
		StringBuilder pre = null;
		ans+= value.length();
		
		for(int index=0;index<value.length();index++){
			sb = new StringBuilder(value.substring(0,index+1));
			while(sb.length() >= 2){
				if(sb.length()%2 == 0){
					pre = new StringBuilder(sb.substring(0,sb.length()/2));
					rev = new StringBuilder(sb.substring(sb.length()/2,sb.length()));
					if(pre.toString().equals(rev.reverse().toString())){
						ans++;
					}
				}else{
					pre = new StringBuilder(sb.substring(0,sb.length()/2));
					rev = new StringBuilder(sb.substring(sb.length()/2+1,sb.length()));
					if(pre.toString().equals(rev.reverse().toString())){
						ans++;
					}
				}
				sb.deleteCharAt(0);
			}
		}
		return ans;
	}
}