package exercises;

import javax.swing.JOptionPane;

/* See the diagram in the "doc" directory. */

public class AreYouHappy {

	public static void main(String[] args) {

		String userAnswer1 = JOptionPane.showInputDialog("Are you happy?");

		if (userAnswer1.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		} else if (userAnswer1.equals("no")) {
			String userAnswer2 = JOptionPane.showInputDialog("Do you want to be happy?");

			if (userAnswer2.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something!");
			} else if (userAnswer2.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			} else {
				JOptionPane.showMessageDialog(null, "Unknown answer!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Unknown answer!");
		}
	}

}
