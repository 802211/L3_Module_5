package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class LongChipCompetition {
	/**
	 * The Beatles are eating lunch and playing a game to see who has the longest
	 * chip. (In England, french fries are called "chips".) * Find the Beatle with
	 * the longest chip. You may not edit the Chip or Beatle classes. Make sure to
	 * initialize The Beatles before you start your search. *
	 **/
	private ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();

	public static void main(String[] args) {
		LongChipCompetition LCC = new LongChipCompetition();
		LCC.initializeBeatles();
		LCC.LongChip();
	}

	public void LongChip() {
		double currentc = 0;
		String name = "";
		for (int i = 0; i < theBeatles.size(); i++) {
			Beatle b = theBeatles.get(i);

			for (int j = 0; j < b.getChips().size(); j++) {
				Chip c = b.getChips().get(i);
				double l = c.getLength();
				if (l > currentc) {
					currentc = l;
					name = b.getName();
				} else {

				}
			}
		}

		System.out.println(name + " has the longest chip. The chip was " + currentc + " (inches?) long.");

	}

	private void initializeBeatles() {
		Beatle george = new Beatle("George");
		Beatle john = new Beatle("John");
		Beatle paul = new Beatle("Paul");
		Beatle ringo = new Beatle("Ringo");
		theBeatles.add(george);
		theBeatles.add(john);
		theBeatles.add(paul);
		theBeatles.add(ringo);
	}
}

class Beatle {
	private String name;
	private ArrayList<Chip> chips = new ArrayList<Chip>();

	public Beatle(String name) {
		this.name = name;
		initializePlateOfChips();
	}

	private void initializePlateOfChips() {
		int numberOfChips = new Random().nextInt(100);
		for (int i = 0; i < numberOfChips; i++) {
			chips.add(new Chip(new Random().nextDouble() * 10));
			if (this.name.contains("in"))
				chips.add(new Chip(10));
		}
	}

	public ArrayList<Chip> getChips() {
		return this.chips;
	}

	public String getName() {
		return this.name;
	}
}

class Chip {
	private double length;

	public double getLength() {
		return length;
	}

	Chip(double d) {
		this.length = d;
	}
}
