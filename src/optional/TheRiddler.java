package optional;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		int score = 0;
		JOptionPane.showMessageDialog(null, "Riddle me this!");

		String riddleAnsw1 = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		if (riddleAnsw1.equals("stamp")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			JOptionPane.showMessageDialog(null, "A stamp");
		}
		String riddleAnsw2 = JOptionPane
				.showInputDialog("Who makes it, has no need of it.\r\n" + "Who buys it, has no use for it.\r\n"
						+ "Who uses it can neither see nor feel it.\r\n" + "What is it? ");
		if (riddleAnsw2.equals("coffin")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			JOptionPane.showMessageDialog(null, "A coffin");
		}
		String riddleAnsw3 = JOptionPane.showInputDialog(
				"Which creature walks on four legs in the morning, two legs in the afternoon, and three legs in the evening?");
		if (riddleAnsw3.equals("man")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			JOptionPane.showMessageDialog(null, "Man");
		}
		String riddleAnsw4 = JOptionPane
				.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
		if (riddleAnsw4.equals("candle")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			JOptionPane.showMessageDialog(null, "A candle.");
		}
		String riddleAnsw5 = JOptionPane.showInputDialog("What has hands but can not clap?");
		if (riddleAnsw5.equals("clock")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			JOptionPane.showMessageDialog(null, "A clock");
		}
		String riddleAnsw6 = JOptionPane.showInputDialog(
				"You can drop me from the tallest building and I'll be fine, but if you drop me in water I die. What am I?");
		if (riddleAnsw6.equals("paper")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			JOptionPane.showMessageDialog(null, "Paper");
		}
		String riddleAnsw7 = JOptionPane.showInputDialog("What has a head and a tail, but no body?");
		if (riddleAnsw7.equals("coin")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			JOptionPane.showMessageDialog(null, "A coin");
		}
		String riddleAnsw8 = JOptionPane.showInputDialog(
				"Paul's height is six feet, he's an assistant at a butcher's shop, and wears size 9 shoes. What does he weigh?");
		if (riddleAnsw8.equals("meat")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			JOptionPane.showMessageDialog(null, "Meat");
		}
		String riddleAnsw9 = JOptionPane.showInputDialog("What kind of room has no doors or windows?");
		if (riddleAnsw9.equals("mushroom")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			JOptionPane.showMessageDialog(null, "A mushroom");
		}
		JOptionPane.showMessageDialog(null,"Your score is " + score + " out of 9");
	}
}
