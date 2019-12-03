//	 Program to check whether a given number is prime or not.
package com.test.assignment_22nov;

import java.util.Scanner;

public class Primenumber {

	private int i, m = 0, flag = 0;

	public void checkPrime(int n) {
		//to reduce the number of iteration
		m = n / 2;
		//if the input given by user is 0 or 1!
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			// check whether the number is prime or not.
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");

			}
		}
	}

	public static void main(String args[]) {
		Primenumber obj = new Primenumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		obj.checkPrime(n);
		sc.close();
	}
}
