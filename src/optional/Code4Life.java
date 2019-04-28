package optional;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {

	public static void main(String[] args) {

	String userAnswer = JOptionPane.showInputDialog("How many hours do you spent programming this week?");
	try {
		int userAnswerInt = Integer.parseInt(userAnswer);

		if (userAnswerInt <= 2) {
			JOptionPane.showMessageDialog(null, "Stop watching YouTube and write code instead!!!");
		} else if (userAnswerInt <= 4) {
			JOptionPane.showMessageDialog(null, "You are CODE NINJA!");
		} else if (userAnswerInt >= 5) {
			playBatmanTheme();
		} else {
			JOptionPane.showMessageDialog(null, "That is not a number");
		}

	 } catch (NumberFormatException e) {
			System.out.println("Not a number");
			}
     }
	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
