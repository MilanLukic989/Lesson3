package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {

		int randomNum = new Random().nextInt(100);
		System.out.println(randomNum);
		int tries;
		String sTries; 

		for (tries = 3; tries > 0; tries--) {
			String userAnswer = JOptionPane.showInputDialog("Guess a number between 1 and 100");
			try {
			int userAnswerInt = Integer.parseInt(userAnswer);
			sTries = tries-1 + " more tries";
			if(userAnswerInt > 100 || userAnswerInt < 1) {
				JOptionPane.showMessageDialog(null, "Bad number!");
			} else {
				if (randomNum > userAnswerInt) {
					JOptionPane.showMessageDialog(null, "Number is higher than " + userAnswer + "\n" + sTries);
				} else if (randomNum < userAnswerInt) {
					JOptionPane.showMessageDialog(null, "Number is lower than " + userAnswer + "\n" + sTries);
				} else {
					JOptionPane.showMessageDialog(null, "Correct! Number is " + userAnswer + "\n You won!");
					System.exit(0);
				}
			}
			}catch(NumberFormatException e) {
				System.out.println("String is not a number");
			}
		}
		JOptionPane.showMessageDialog(null, "You Lose! Better Luck next time.");
	}
}
					
