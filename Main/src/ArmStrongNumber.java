public class ArmStrongNumber {
    //153 : 1^(3) + 3^(3) + 5^(3)
	// (1*1*1) + (3*3*3) + (5*5*5)
	// 1 + 27 + 125
	//153
	
	public static void main (String[] args) {
		boolean result = isArmstrong(153);
	        System.out.println(result);
	}
	
    public static boolean isArmstrong (int number) {
		
		int digit;
		int temp =number;
		int sum =0;
		
		while(number>0) {
			
			digit = number % 10;
			System.out.println(digit);
			sum = sum + digit*digit*digit;
			//System.out.println(sum);
			number = number/10;
			//System.out.println(number);
		}
		if (temp ==sum)
			{
			return true;
			}
		else {
			return false;
		}
	}
}