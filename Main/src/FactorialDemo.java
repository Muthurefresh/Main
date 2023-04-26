
public class FactorialDemo {

	public static void main(String[] args) {
		//5! = 5*4*3*2*1
	int number = 5;
	int result = 1;
	int counter = number;
	
		while(counter>=1) {
		result = result * counter;
		//counter = counter - 1; or counter-- means the same
			counter--;
			}
		System.out.println("Fact result:" + result);
		//Ctrl + F11 to run the Java prgm; shortcut
		//Ctrl + Space to type the rest of the items;
		//leetcode.com; click problems after signing in; ==> For practice;
}
}
