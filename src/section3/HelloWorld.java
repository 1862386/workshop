package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What's your name?");
	JOptionPane.showMessageDialog(null, "Hello" + answer);
}
}
