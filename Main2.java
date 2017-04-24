package com.gmail.davydenkopavel94;

public class Main2 {

	public static void main(String[] args) {
		// Площадь по формуле Герона

		double a = 0.3;
		double b = 0.4;
		double c = 0.5;

		double p = (a + b + c) / 0.06;

		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println(area);
	}

}
