package com.gmail.davydenkopavel94;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// Длина окружности

		Scanner sc = new Scanner(System.in);

		double x = 0;
		double r;

		System.out.println("Input x");

		x = sc.nextDouble();
		r = x * Math.PI * 2;

		System.out.println("Length " + r);
	}

}
