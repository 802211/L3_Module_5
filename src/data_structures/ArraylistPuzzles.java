package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class ArraylistPuzzles {

	public static void main(String[] args) {
		ArraylistPuzzles Alp = new ArraylistPuzzles();
		//Alp.DinnerDecider();
		//Alp.ComedyCentral();
		//Alp.BandNameGenerator();
		//Alp.Overload();
	}
	
	void DinnerDecider() {
		ArrayList <String> Food = new ArrayList <String>();
		Food.add("pizza");
		Food.add("steak");
		Food.add("nothing");
		Food.add("fruit");
		Food.add("air");
		int x = new Random().nextInt(5);
		System.out.println("You should eat " + Food.get(x) + ".");	
	}

	void ComedyCentral() {
		ArrayList <String> J = new ArrayList <String>();
		J.add("What do you call an alligator in a vest?");
		J.add("What do you call a fake noodle?");
		J.add("What gets wetter the more it dries?");
		
		ArrayList <String> P = new ArrayList <String>();
		P.add("An Investigator");
		P.add("An Impasta");
		P.add("A Towel");
	
		int n = new Random().nextInt(3);
		
		System.out.println(J.get(n));
		System.out.println(P.get(n));
	}
	
	void BandNameGenerator() {
		ArrayList <String> Adj = new ArrayList <String>();
		Adj.add("mushy");
		Adj.add("sharp");
		Adj.add("calm");
		Adj.add("loud");
		
		ArrayList <String> Pn = new ArrayList <String> ();
		Pn.add("storms");
		Pn.add("rocks");
		Pn.add("waves");
		Pn.add("photos");
	
		int a = new Random().nextInt(4);
		int p = new Random().nextInt(4);
		
		System.out.println(Adj.get(a) + " " + Pn.get(p));
		
	}
	
	void Overload() {
		ArrayList <Integer> Ol = new ArrayList <Integer> ();
		for (int i = 0; i < 1000000000; i++) {
			Ol.add(i);
		}
		System.out.println(Ol);
	}
	
}
