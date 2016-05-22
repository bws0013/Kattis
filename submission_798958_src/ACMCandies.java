import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

// https://open.kattis.com/problems/judging

public class ACMCandies {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		int t = in.nextInt();
		for(int i = 0; i < t; i++) {
			int n = in.nextInt();
			long num = 0;
			for(int j = 0; j < n; j++) {
				num += in.nextLong() % n;
			}
			String answer = "YES";
			if(num % n != 0) {
				answer = "NO";
			}
			System.out.println(answer);
		}
	}
	

}