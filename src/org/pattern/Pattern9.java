package org.pattern;

import java.util.Scanner;

public class Pattern9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = sc.nextInt();
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		for(int il=1;il<=n-1;il++)
		{
			 for (int c = n - il; c >= 1; c--) {
	                System.out.print("*");
	            }
	            System.out.println();
		}
		
		
		sc.close();
	}

}
