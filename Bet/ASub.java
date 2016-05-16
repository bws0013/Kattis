/*
	Ben Smith
*/

import java.util.*;
import java.math.*;
import java.io.*;

// Problem description: https://open.kattis.com/problems/bobby

public class ASub {

	public static void main(String[] args) {

		Kattio k = new Kattio(System.in);

		int cases = k.getInt();

		for(int t = 0; t < cases; t++) {
			
			
			double R = k.getDouble();
			double S = k.getDouble();

			double X = k.getDouble();
			double Y = k.getDouble();

			double W = k.getDouble();

			//double choose = factorial(S) / (factorial(R) *factorial(S - R));

			double pwin =  (S - R + 1) / S; 
			double ploss = 1 - pwin;

			double sum = 0; 
			for(double i = X; i <= Y; i++) {
				double choose = factorial(Y) / (factorial(i) *factorial(Y - i));
				choose = choose * Math.pow(pwin, i) * Math.pow(ploss, Y - i);

				sum += choose;
			}
			double res = W * sum;
			if (res > 1) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			




		}


	}	


	static double factorial(double n) {
		double total = 1;
		for (double i = n; i > 1; i--) {
			total *= i;
		}
		return total;
	}
}