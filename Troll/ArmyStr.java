import java.math.*;
import java.util.*;
import java.io.*;

public class ArmyStr {
	

	public static void main(String[] args) {
		Kattio k = new Kattio(System.in);

		int bridges = k.getInt();

		int knights = k.getInt();

		int minimum = k.getInt();

		int party = knights / minimum;

		int days = 0;
		int temp = new Integer(bridges);
		while(temp > 1) {
			temp = temp - party;
			days++;
		}


		if(bridges == 1) {
			System.out.println(1);
		}
		else {
			System.out.println(days);
		}
		




	}


}