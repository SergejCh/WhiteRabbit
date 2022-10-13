package com.company.Lesson15;
// Конструктор - это метод, который используется при создании объекта
// используется и необходим при инициализации полей объекта класса
public class Constructor {
	public void foo() { // метод foo


		// создаем объекты класса Constructor
		Flower flower = new Flower (); // конструктор по умолчанию без параметров
		flower.name = "Ромашка";
		flower.color = "Белая";

		// конструктор с заданными параметрами из переменных и строк Flower.java
		Flower flower1 = new Flower ("Роза", "Красная");
		Flower flower2 = new Flower ("Гвоздика", "Розовая");

		System.out.println (flower.name + " " + flower.color);
		System.out.println (flower1.name + " " + flower1.color);
		System.out.println (flower2.name + " " + flower2.color);

	}
}
