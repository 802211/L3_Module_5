import java.util.Random;

public class Randomness {

	public static boolean randomB() {
		boolean b = false;
		int rand = new Random().nextInt(2);
		if (rand == 1) {
			b = true;
		}
		else if(rand == 0) {
			b = false;
		}
		return b;
	}
	
	public static int randomI() {
		int r = new Random().nextInt(10) + 1;
		
		return r;
	}
}
