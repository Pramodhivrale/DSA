package com.pattern;

import java.util.Scanner;

public class Pattern1 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int c=1;c<=n;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
