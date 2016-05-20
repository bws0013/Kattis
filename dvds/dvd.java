import java.util.*;
import java.math.*;
import java.io.*;

// https://open.kattis.com/problems/dvds

public class dvd {

	// 2i + 1 and 2i + 2
	// see slides
	
	public static void main(String[] args) {
		Kattio k = new Kattio(System.in);

		int tests = k.getInt();

		for(int t = 0; t < tests; t++) {
			int total = k.getInt();

			//ArrayList<Integer> arr = new ArrayList<Integer>();
			
			
			int add = 1;
			for(int i = 0; i < total; i++) {
				
				if(k.getInt() == add) {
					add++;
				}

			}

			System.out.println(total - add + 1);

		}

	}
}