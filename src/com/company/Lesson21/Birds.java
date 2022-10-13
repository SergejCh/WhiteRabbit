package com.company.Lesson21;
	/* Наследование.
	Отношение между классами, при котором характеристики одного класса
	передаются другом классу без необходимости их повторного определения
	 */
public class Birds {
	private String name; // создаем личное имя каждой птицы
		private Wings wings;

		public Birds () {
			this.name = name; // ключевое this указывает на данных класс
			this.wings = wings;
		}

		public Birds ( String name, String wings ) {

		}

		public Birds ( String name, Wings wings ) {

		}

		public void walk(){
			System.out.println ("\nМы птицы гуляем!");
		}

		public String getName () {
			return name;
		}

		public void setName ( String name ) {
			this.name = name;
		}

		public Wings getWings () {
			return wings;
		}

		public void setWings ( Wings wings ) {
			this.wings = wings;
		}
	}
