import java.util.*;
import java.math.*;
import java.io.*;

// https://open.kattis.com/problems/8queens

public class ZSub {
    
    public static void main(String[] args) {
    	Kattio k = new Kattio(System.in);

    	char[][] board = new char[8][24];
    	char[][] board2 = new char[8][24];

    	// Reading in the board
    	int starCount = 0;
    	for(int i = 0; i < 8; i++) {
    		String line = k.getWord();
    		for(int j = 0; j < 8; j++) {
    			board[i][j + 8] = line.charAt(j);
    			board2[7 - i][j + 8] = line.charAt(j);
    			if(line.charAt(j) == '*') {
    				starCount++;
    			}
    		}
    	}

    	/*

        for(int i = 0; i < 8; i++) {
    		System.out.println();
    		for(int j = 0; j < 24; j++) {
    			System.out.print(board[i][j] + " ");
    		}
    	}
    	System.out.println();
    	System.out.println();
    	for(int i = 0; i < 8; i++) {
    		System.out.println();
    		for(int j = 0; j < 24; j++) {
    			System.out.print(board2[i][j] + " ");
    		}
    	}
    	*/



    	// Making sure there are 8 queens
    	if(starCount != 8) {
    		System.out.println("invalid");
    		System.exit(0);
    	}
        /*
        for(int i = 0; i < 8; i++) {
    		System.out.println();
    		for(int j = 0; j < 24; j++) {
    			System.out.print(board[i][j] + " ");
    		}
    	}
    	*/

    	// Checking up/down, right/left
    	for(int i = 0; i < 8; i++) {
    		int rowCount = 0;
    		int heightCount = 0;
    		for(int j = 8; j < 16; j++) {
    			if(board[i][j] == '*') {
    				rowCount++;
    			}
    			if(board[j - 8][i + 8] == '*') {
    				heightCount++;
    			}
    		}
    		if(rowCount > 1 || heightCount > 1) {
    			System.out.println("invalid");
    			System.exit(0);
    		}

    		rowCount = 0;
    		heightCount = 0;
    	}

    	for(int i = 0; i < 16; i++) {
    		int diag1 = 0;
    		int diag2 = 0;

    		for(int j = 0; j < 8; j++) {
    			if(board[j][j + i] == '*') {
    				diag1++;
    			}
    			if(board2[j][j + i] == '*') {
    				diag2++;
    			}
    		}
    		if(diag1 > 1 || diag2 > 1) {
    			System.out.println("invalid");
    			System.exit(0);
    		}

    		diag1 = 0;
    		diag2 = 0;
    	}

    	System.out.println("valid");


    }   
}