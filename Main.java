package com.gmail.davydenkopavel94;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Выведите на экран прямоугольник из *. Причем высота и ширина
		// прямоугольника вводятся с клавиатуры. Например ниже представлен
		// прямоугольник с высотой 4 и шириной 5.
		// *****
		// * *
		// * *
		// *****
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		System.out.println("Enter length and height");
		x = sc.nextInt();
		y = sc.nextInt();
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				if (j == 0 || j == x - 1 || i == 0 || i == y - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			sc.close();
		}
	}

}
