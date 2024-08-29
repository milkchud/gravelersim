package pokecode;

import java.util.Random;


public class Main {

	public static void main(String[] args) {
		
		final int attempts = 1000000;
		int current_attempt = 0;
		int biggest = 0;
		int current_sim = 0;
		
		while (attempts > current_attempt) {
			current_sim = gravelersim();
			if (current_sim > biggest) {
				biggest = current_sim;
			}
			current_attempt += 1;
		}
		System.out.println("Out of "+ attempts+" attempts, the highest number was " + biggest+" turns.");
	}
	
	
	public static int gravelersim() {
		Random rand = new Random();
		int safecount = 54;
		int turns_taken = 0;
		while (safecount > 0) {
			int trying = rand.nextInt(1,5);
			if (trying != 1) {
				safecount = safecount-1;
			}
			turns_taken = turns_taken + 1;
		}
		return turns_taken;
	}
	
}

