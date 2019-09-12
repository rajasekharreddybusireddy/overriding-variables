package com.javabyrajasekhar.overriding;

public class App {
	public static void main(String[] args) {
		P p = new P();
		System.out.println(p.s);
		C c = new C();
		System.out.println(c.s);

		P p1 = new C();
		System.out.println(p1.s);
	}
}
