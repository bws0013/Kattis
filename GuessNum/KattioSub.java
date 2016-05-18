import java.util.*;
import java.io.*;
import java.math.*;

public class KattioSub {
	


	public static void main(String[] args) {
		Kattio k = new Kattio(System.in);

		String c = "correct";
		String l = "lower";
		String h = "higher";
		
		double guess = 500;

		int toSub = 256;
		int toAdd = 256;

		System.out.println(500);
		while(true) {

			String word = k.getWord();
			if(word.equals(c)) {
				System.exit(0);
			}
			//System.out.println(guess);

			if(word.equals(l)) {
				guess = guess - toSub;
				toSub = toSub / 2;
				toAdd = toAdd / 2;
			}
			else {
				guess = guess + toAdd;
				toSub = toSub / 2;
				toAdd = toAdd / 2;
			}


			//System.out.println(guess);

			int g = (int) guess;
			if(g > 1000) {
				System.out.println(1000);
			} else if(g < 1) {
				System.out.println(1);
			} else {
				System.out.println(g);
			}
		}
		


 	}

	


}



/*
	import java.util.*;
import java.io.*;
import java.math.*;

public class KattioSub {
	


	public static void main(String[] args) {
		Kattio k = new Kattio(System.in);

		String c = "correct";
		String l = "lower";
		String h = "higher";
		
		double guess = 1000;

		System.out.println(1000);
		while(true) {

			String word = k.getWord();
			if(word.equals(c)) {
				break;
			}
			//System.out.println(guess);

			if(word.equals(l)) {
				guess = guess / 2;
			}
			else {
				guess = guess * 1.5;
			}
			//System.out.println(guess);

			int g = (int) guess;
			System.out.println(g);
		}
		


 	}

	


}



*/
