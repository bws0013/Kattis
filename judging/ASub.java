import java.util.*;
import java.math.*;
import java.io.*;

 
// https://open.kattis.com/problems/judging

public class ASub {

	public static void main(String[] args) {

		Kattio k = new Kattio(System.in);

		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();

		List<String> words = new ArrayList<String>();

		int num = k.getInt();

		for(int i = 0; i < num; i++) {
			String term = k.getWord();

			if(map1.containsKey(term)) {
				int count = map1.get(term);
				count++;
				map1.put(term, count);

			} else {
				map1.put(term, 1);
				words.add(term);
			}
		}

		

		for(int i = 0; i < num; i++) {
			String term = k.getWord();

			if(map2.containsKey(term)) {
				int count = map2.get(term);
				count++;
				map2.put(term, count);

			} else {
				map2.put(term, 1);
			}
		}

		int correct = 0;

		for(int i = 0; i < words.size(); i++) {
			String term = words.get(i);

			if(map1.containsKey(term) && map2.containsKey(term)) {
				int diff = Math.abs(map1.get(term) - map2.get(term));
				int big = Math.max(map1.get(term), map2.get(term));
				//int small = Math.min(map1.get(term), map2.get(term));
				correct += big - diff;
			}

		}

		System.out.println(correct);
	}	
}