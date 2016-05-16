/*
    Ben Smith
*/

import java.util.*;
import java.io.*;
import java.math.*;

// Problem description: https://open.kattis.com/problems/cd

public class first {
	


	public static void main(String[] args) {
		Kattio k = new Kattio(System.in);

		while(true) {
            int jackNum = k.getInt();
            int jillNum = k.getInt();
            if(jackNum + jillNum == 0) {
                break;
            }

            int[] cdsJack = new int[jackNum];
            int[] cdsJill = new int[jillNum];

            for(int i = 0; i < jackNum; i++) {
                cdsJack[i] = k.getInt();
            }
            for(int i = 0; i < jackNum; i++) {
                cdsJill[i] = k.getInt();
            }

            int size = Math.max(cdsJack[jackNum - 1], cdsJill[jillNum - 1]);

            int[] compArr1 = new int[size + 1];
            int[] compArr2 = new int[size + 1];

            for(int i = 0; i < jackNum; i++) {
                compArr1[cdsJack[i]] = 1;
            }
            for(int i = 0; i < jackNum; i++) {
                compArr2[cdsJill[i]] = 1;
            }

            int count = 0;
            for(int i = 0; i < size + 1; i++) {
                if(compArr1[i] == 1 && compArr2[i] == 1) {
                    count++;
                } 
            }           

            System.out.println(count);
        }
    }
}