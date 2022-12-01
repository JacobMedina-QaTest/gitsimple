package com.gitpractice.project;

import java.util.Scanner;

public class StarPatternClass {

	public static void main(String[] args) {

		System.out.println("How many stars do you want?");
		Scanner scan = new Scanner(System.in);
		int numOfScars = scan.nextInt();
		
		for(int i = 1; i <= numOfScars; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = numOfScars - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
