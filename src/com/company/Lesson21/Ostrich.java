package com.company.Lesson21;

public class Ostrich extends Birds{
	private static final String name = "Страус";
	// private static final String wings = " не летает";

	public Ostrich () {
		super ();
	}


	// добавляем метод для этого класса
	public void hideHead() {

		System.out.println ("Я страус спрятался с головой ...");
		super.walk ();
	}

}
