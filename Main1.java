package com.gmail.davydenkopavel94;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// Разбор целого числа

		Scanner sc = new Scanner(System.in);

		int x;

		System.out.println("Input x");

		x = sc.nextInt();

		System.out.println(x % 100000 / 10000);
		System.out.println(x % 10000 / 1000);
		System.out.println(x % 1000 / 100);
		System.out.println(x % 100 / 10);
		System.out.println(x % 10);

	}

}