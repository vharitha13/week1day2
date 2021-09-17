package secondDay2;

public class Armstrong {

	public static void main(String[] args) {
		int input = 153;
		int calculated=0, remainder, original=153;
		while(input>0) {
			remainder=input%10;
			input=input/10;
			calculated=calculated+(remainder*remainder*remainder);
		}
			if(calculated==original) {
				System.out.println("Armstrong number");
			}
			else {
				System.out.println("Not an Armstrong number");
			}
		}

	}