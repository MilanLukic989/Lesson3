package exercises;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

/**
 * The first Speak & Spell was introduced at the summer Consumer Electronics
 * Show in June 1978, making it one of the earliest hand-held electronic devices
 * with a visual display to use interchangeable game cartridges. It was my
 * favorite game as a kid.
 * 
 * https://www.youtube.com/watch?v=qM8FcN0aAvU
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Write the word you hear!");
		speak("mandlebrot");
		String userSpelling = JOptionPane.showInputDialog("Spell it!");
		int score = 0;

			if (userSpelling.equals("mandlebrot")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				score += 2;
			} else {
				JOptionPane.showMessageDialog(null, "Wrong!");
				score--;
			}

			speak("concatenate");
			String userSpelling1 = JOptionPane.showInputDialog("Spell it!");

			if (userSpelling1.equals("concatenate")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				score += 2;
			} else {
				JOptionPane.showMessageDialog(null, "Wrong!");
				score--;
			}

			speak("handkerchief");
			String userSpelling2 = JOptionPane.showInputDialog("Spell it!");

			if (userSpelling2.equals("handkerchief")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				score += 2;
			} else {
				JOptionPane.showMessageDialog(null, "Wrong!");
				score--;
			}

			speak("maintenance");
			String userSpelling3 = JOptionPane.showInputDialog("Spell it!");

			if (userSpelling3.equals("maintenance")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				score += 2;
			} else {
				JOptionPane.showMessageDialog(null, "Wrong!");
				score--;
			}

			speak("deductible");
			String userSpelling4 = JOptionPane.showInputDialog("Spell it!");

			if (userSpelling4.equals("deductible")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				score += 2;
			} else {
				JOptionPane.showMessageDialog(null, "Wrong!");
				score--;
			}

			speak("pronunciation");
			String userSpelling5 = JOptionPane.showInputDialog("Spell it!");

			if (userSpelling5.equals("pronunciation")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				score += 2;
			} else {
				JOptionPane.showMessageDialog(null, "Wrong!");
				score--;
			}

			JOptionPane.showMessageDialog(null, "Your score is: " + score);
			System.exit(0);
		
	}

	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}
