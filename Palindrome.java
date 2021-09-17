package secondDay2;

public class Palindrome {

	public static void main(String[] args) {
		int a = 454;
		int b, sum = 0;
		int temp = a;
		while (a > 0) {
			b = a % 10;
			a = a / 10;
			sum = (sum * 10) + b;
		}
		if (temp == sum) {
			System.out.println("Palindrome number is:"+sum);
		} else {
			System.out.println("Not a palidrome number");
		}

	}
}
