import javax.swing.*;

public class HelloWorldX {
	public static void main( String args[] ) {
		JFrame frame = new JFrame ("Hello World X!");

		JLabel label = new JLabel( "Hello Java!", JLabel.CENTER );

		frame.getContentPane().add(label);

		frame.setSize(300, 300);
		frame.setVisible (true);
	}
}