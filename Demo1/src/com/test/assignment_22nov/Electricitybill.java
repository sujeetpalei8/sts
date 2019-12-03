/*      Program to calculate the electricity bill 
 		For 1st 100 units the cost is 5/unit
 		For next 200 units the cost is 10/unit
 		and for rest of the unit the cost is 20/unit
 */
package com.test.assignment_22nov;

import java.util.Scanner;

public class Electricitybill {
	private int unit;
	private int cost = 0;

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public int printCost() {
		if (unit > 0 && unit <= 100) {
			cost = unit * 5;
		} else if (unit > 100 && unit < 301) {
			cost = 500 + ((unit - 100) * 10);
		} else if (unit > 300) {
			cost = 2500 + ((unit - 300) * 20);
		}
		return cost;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of units");
		int unit = sc.nextInt();
		Electricitybill obj = new Electricitybill();
		obj.setUnit(unit);

		System.out.println("Final Bill: " + obj.printCost());
		sc.close();
	}

}
