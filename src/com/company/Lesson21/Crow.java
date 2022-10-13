package com.company.Lesson21;

public class Crow extends Birds{
	public Crow ( String name, Wings wings ) {
		super (name, wings);
	}

	public Crow () {
		super ();
	}

	// добавляем метод для этого класса
	public void fly(){
		System.out.println ("Я ворона и умею летать ... ");
	}
}
