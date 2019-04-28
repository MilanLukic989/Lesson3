package optional;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		String momsBirthday = "March 29th";
		String dadsBirthday = "July 10th";
		String brosBirthday = "April 18th";
		String myBirthday = "October 30th";

		String userAsking = JOptionPane.showInputDialog("Whose birthday do you want to see?");

		if (userAsking.equals("mom")) {
			JOptionPane.showMessageDialog(null, "Here it is: " + momsBirthday);
		} else if (userAsking.equals("dad")) {
			JOptionPane.showMessageDialog(null, "Here it is: " + dadsBirthday);
		} else if (userAsking.equals("brother")) {
			JOptionPane.showMessageDialog(null, "Here it is: " + brosBirthday);
		} else if (userAsking.equals("my")) {
			JOptionPane.showMessageDialog(null, "Here it is: " + myBirthday);
		} else {
			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday!");
		}

	}
}
