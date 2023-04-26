
public class ReverseNumber {
	//Reverse of a number : 123 ==> 321
	
	public static void main(String[] args) {
		int result = reverse(1245);
		System.out.println(result);
	}
public static int reverse(int number) {
	
	int reversenumber=0;
	int digit=0;
	
	while(number>0) {
		digit = number%10;
		System.out.println(digit);
		// Thousand Hundred Tens Units
		
		reversenumber = reversenumber*10 + digit;
		
		number = number /10;
		}
	return reversenumber;
}

}