package optional;

/* This is an online puzzle from Google to practice if/else logic. 
*			bit.ly/bird-puzzle
*/
public class BlocklyBirdExercise {

	public static void main(String[] args) {

		heading(45);                                     //lvl 1

		if (noWorm()) {                                  //lvl 2
			heading(0);
		} else {
			heading(90);
		}

		if (noWorm()) {                                  //lvl 3
			heading(315);
		} else {
			heading(45);
		}

		if (getX() < 80) {                               //lvl 4
			heading(0);
		} else {
			heading(270);
		}

		if (getY() > 20) {                               //lvl 5
			heading(270);
		} else {
			heading(180);
		}

		if (noWorm()) {                                  //lvl 6
			heading(345);
		} else if (getX() > 45) {
			heading(120);
		} else {
			heading(150);
		}

		if (getY() > 45) {                               //lvl 7
			heading(225);
		} else if (noWorm()) {
			heading(330);
		} else {
			heading(180);
		}

		if (noWorm() && getX() < 45) {                   //lvl 8
			heading(45);
		} else if (noWorm() && getY() < 60) {
			heading(315);
		} else if (getY() < 50 && getX() > 45) {
			heading(135);
		} else {
			heading(45);
		}

		if (noWorm() && getX() > 20) {                    //lvl 9
			heading(180);
		} else if (noWorm() && getY() > 20) {
			heading(270);
		} else if (getY() < 70 && getX() < 40) {
			heading(90);
		} else {
			heading(315);
		}

		if (noWorm() && getX() < 30 && getY() < 80) {     //lvl 10
			heading(90);
		} else if (noWorm() && getX() < 80) {
			heading(0);
		} else if (noWorm() && getX() > 50) {
			heading(270);
		} else if (getX() > 20 && getY() < 80) {
			heading(90);
		} else if (getX() > 20) {
			heading(180);
		} else {
			heading(270);
		}
	}

	private static int getX() {
		return 0;
	}

	private static int getY() {
		return 0;
	}

	private static boolean noWorm() {
		return false;
	}

	private static void heading(int i) {

	}
}
