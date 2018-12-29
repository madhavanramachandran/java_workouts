package co.edu.corejava.test;

import java.util.HashMap;
import java.util.Scanner;

public class TestMainClass {

    static int divisibleSumPairs(int n, int k, int[] ar) {
    	if(( n >=2 || n <=100 ) && ( k >=1 || k <= 100)) {
    		for(int i= 0, j = 0; i<j; i++, j++) {
    			
    		}
    	}
    	return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
        
        HashMap map = null;
    }
}