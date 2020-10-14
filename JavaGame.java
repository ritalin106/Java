import java.util.Scanner;

public class JavaGame {
	
	public static void main(String[] args) {
	
		int low = 0;
		int high = 99;
		int s = (int) (Math.random() * 100);
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("(" + low + ", " + high + ") = ?");
			int g = input.nextInt();
			
			if (g > high || g < low) {
				System.out.println("Out of range. Try again.");
				continue;
			}
			
			if (g > s) {
				high = g - 1;
				System.out.println("Too large.");
			} else if (g < s) {
				low = g + 1;
				System.out.println("Too small.");
			} else {
				System.out.println("You win.");
				break;
	
			}
			
			if (low == high) {
				System.out.println("You lose.");
				break;
			}
		}
	}	
}
		