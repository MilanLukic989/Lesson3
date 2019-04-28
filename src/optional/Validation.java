package optional;

import java.util.Random;

public class Validation {
	public static void main(String[] args) {

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		int randomNumber = new Random().nextInt(5);
		System.out.println(randomNumber);
		
		for (int i = 0; i <= 9; i++) {
			
		if (randomNumber == 0) {
            System.out.println("You have such interesting personality"); 
	        }
        else if (randomNumber == 1) {
            System.out.println("You are awesome"); 
	        }
        else if (randomNumber == 2) {
            System.out.println("You have an amazing face"); 
	        }
        else if (randomNumber == 3) {
            System.out.println("You have powerfull features, has anybody told you that?"); 
	        }
        else {
            System.out.println("You are so intelligent"); 
	        }
		}
	}
}


