package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
		Random r2d2 = new Random();
		int x = r2d2.nextInt(4);

		// 3. Print out this variable
		System.out.print(x);

		// 4. Get the user to enter something that they think is awesome
		String blue = JOptionPane.showInputDialog("Enter something that is awesome");
		// 5. If the random number is 0
		if (x == 0) {
			// -- tell the user whatever they entered is awesome!
			JOptionPane.showMessageDialog(null, blue + " is AWESOME");
		}
		// 6. If the random number is 1
		if (x == 1) {
			// -- tell the user whatever they entered is ok.
			JOptionPane.showMessageDialog(null, blue + " is Ok");
		}
		// 7. If the random number is 2
		if (x == 2) {
			// -- tell the user whatever they entered is boring.
			JOptionPane.showMessageDialog(null, blue + " is boring");
		}
		// 8. If the random number is 3
		if (x == 3) {
			// -- write your own answer
			JOptionPane.showMessageDialog(null, blue + " is annoying");
		}
	}
}