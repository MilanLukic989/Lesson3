package optional;

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		isWeekday = (JOptionPane.showConfirmDialog(null, "is it a weekday?", "",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
		isVacation = (JOptionPane.showConfirmDialog(null, "Are you on vacation?", "",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
        if (isWeekday) {
            if (isVacation) {
				JOptionPane.showMessageDialog(null, "Sleep in");
			} else {
				JOptionPane.showMessageDialog(null, "Get up lazybones");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Sleep in");
		}

		/* Second way to solve it!
		  
		    int userAnswer = JOptionPane.showConfirmDialog(null, "is it a weekday?", "",JOptionPane.YES_NO_OPTION);
		 
		    if (userAnswer == JOptionPane.YES_OPTION) { 
		       int userAnswer2 = JOptionPane.showConfirmDialog(null, "Are you on vacation?", "",JOptionPane.YES_NO_OPTION);
		 
		    if (userAnswer2 == JOptionPane.YES_OPTION) { 
		        JOptionPane.showMessageDialog(null, "Sleep in");
		 
		  } else if (userAnswer2 == JOptionPane.NO_OPTION) {
		        JOptionPane.showMessageDialog(null, "Get up lazybones");
		         } 
		  } else if
		        (userAnswer == JOptionPane.NO_OPTION) {
		         JOptionPane.showMessageDialog(null,"Sleep in"); 
		         }
		 
		 
		 
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * "get up lazybones!". If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */
	}
}
