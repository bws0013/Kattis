/*
	Ben Smith
*/

import java.math.*;
import java.util.*;
import java.io.*;

// Problem description: https://open.kattis.com/problems/matrix

public class ArmyStr {
	


	public static void main(String[] args) {
		Kattio k = new Kattio(System.in);

		int caseCount = 1;
		while(k.hasMoreTokens()) {
			double a = k.getDouble();
			double b = k.getDouble();
			double c = k.getDouble();
			double d = k.getDouble();

			double mult = 1 / ((a * d) - (b * c));


			double temp = new Double(a);

			a = d; 
			d = temp;

			b = b * -1;
			c = c * -1;

			a = a * mult;
			b = b * mult;
			c = c * mult;
			d = d * mult;

			System.out.println("Case " + caseCount + ":");
			System.out.println(Math.round(a) + " " 
				+ Math.round(b) + "\n" + Math.round(c) + " " 
				+ Math.round(d));




			caseCount++;
		}





	}


}