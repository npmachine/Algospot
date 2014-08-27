package com.algospot;

import java.util.Scanner;

public class Mercy {

	public static void main(String[] args) {

		int n;
		Scanner sc;

		sc = new Scanner(System.in);
		n = sc.nextInt();

		if (n > 10)
			n = 10;

		while (n-- > 0) {
			System.out.println("Hello Algospot!");
		}

		sc.close();
	}
}
