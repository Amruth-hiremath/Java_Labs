package palindrome;

public class check_pal {
	
	public Boolean checkfor_pal(int num) {
		int temp = num;
		int rev = 0;
		
		while(temp > 0) {
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp /= 10;
		}
		
		return(rev == num);
	}
	

}
