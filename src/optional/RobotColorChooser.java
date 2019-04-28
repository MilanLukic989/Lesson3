package optional;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {

		Robot rob = new Robot();
		rob.penDown();
		rob.setPenWidth(10);
		rob.setSpeed(8);

		for (int j = 0; j <= 10; j++) {
			String userAsking = JOptionPane.showInputDialog("Choose a color for a robot to draw?");

			if (userAsking.equals("black")) {
				rob.setPenColor(Color.black);
			} else if (userAsking.equals("white")) {
				rob.setPenColor(Color.white);
			} else if (userAsking.equals("blue")) {
				rob.setPenColor(Color.blue);
			} else if (userAsking.equals("red")) {
				rob.setPenColor(Color.red);
			} else if (userAsking.equals("green")) {
				rob.setPenColor(Color.green);
			} else if (userAsking.equals("pink")) {
				rob.setPenColor(Color.pink);
			} else if (userAsking.equals("orange")) {
				rob.setPenColor(Color.orange);
			} else if (userAsking.equals("yellow")) {
				rob.setPenColor(Color.yellow);
			} else {
				rob.setRandomPenColor();
			}
			for (int i = 0; i < 4; i++) {
				rob.move(100);
				rob.turn(90);
				rob.move(100);
			}
			rob.turn(90);
			rob.move(200);
			for (int i = 0; i < 2; i++) {
				rob.turn(-90);
				rob.move(100);
			}
			rob.turn(-90);
			rob.move(200);
		}
	}
}
