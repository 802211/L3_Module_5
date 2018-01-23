import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Plane{

//	Calculate the probability of death based on the following …
//	Total venom = sum of viciousness of venomous snakes (if they aren’t venomous, 
//	it might not be pretty, but it won’t kill you!). This will give a value between 0 - 1000.
//	% chance of death = (total venom *10)/ number of passengers
//  Make sure it can’t be higher than 100%
	
	
	int numberofpassengers;
	ArrayList<Snake> alist = new ArrayList<Snake>();
	Randomness r = new Randomness();
	
	Plane(){
		numberofpassengers = new Random().nextInt(100) + 100;
	}
	
	public static void main(String[] args) {
		Plane p = new Plane();
		p.createSnakes();
	p.totalVenom();
	p.probOfDeath();
	JOptionPane.showMessageDialog(null, "Your probablity of death is " + p.probOfDeath() + "%");
	}
	
	void createSnakes() {
		for (int i = 0; i < 100; i++) {
			Snake s = new Snake(r.randomI(), r.randomB());
			alist.add(s);
		}
		//System.out.println(alist);
	}
	
	private int totalVenom() {
		int n = 0;
		for (int j = 0; j < alist.size(); j++) {
			if(alist.get(j).getvenomous()) {
				n = n + alist.get(j).getviciousness();
			}
	}
		System.out.println(n);
		return n;
	}
	public double probOfDeath() {
		System.out.println(numberofpassengers);
		
			return totalVenom()*10/numberofpassengers;
		}	
		//System.out.println(prob);

	
	
	
}
