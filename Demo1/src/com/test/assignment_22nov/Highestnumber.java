// Program to find highest number between three given numbers
package com.test.assignment_22nov;

import java.util.Scanner;

public class Highestnumber {
	public void maxNum(int a, int b, int c) {
		if (a > b) {
			if (a > c) {
				System.out.println(a + " is highest number");
			} else {
				System.out.println(c + " is highest number");
			}
		} else {
			if (b > c) {
				System.out.println(b + " is highest number");
			} else {
				System.out.println(c + " is highest number");
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Highestnumber obj = new Highestnumber();
		obj.maxNum(a, b, c);
		sc.close();

	}
}
