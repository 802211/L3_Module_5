import java.util.ArrayList;

public class Plane{

	int numberofpassengers;
	ArrayList<Snake> alist = new ArrayList<Snake>();
	Randomness r = new Randomness();
	
	public static void main(String[] args) {
		
	}
	
	void createSnakes() {
		for (int i = 0; i < 100; i++) {
			Snake s = new Snake(r.randomI(), r.randomB());
			alist.add(s);
		}
	}
	
}
