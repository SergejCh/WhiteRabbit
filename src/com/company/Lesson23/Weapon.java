package com.company.Lesson23;
// Общий набор свойств, присущий какой-то или многим группам
// на основе абстрактного класса нельзя создать экземпляр класса
public abstract class Weapon {
	// абстрактные методы могут иметь или не иметь
	private String name;
	public abstract void foo();
	public void show(){
		System.out.println ("\nАвтомат Калашникова 30 патронов");
	}


}
