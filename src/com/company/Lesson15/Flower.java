package com.company.Lesson15;

public class Flower {
	String name;
	String color;

	public Flower () { // создаем конструктор Flower
		// это конструктор без парметров по умолчанию
	}
	public Flower(String myName, String myColor)    {
		// данный конструктор Flower принимает две строки myName, myColor переменных name, color
		color = myColor;
		name = myName;
	}
}
