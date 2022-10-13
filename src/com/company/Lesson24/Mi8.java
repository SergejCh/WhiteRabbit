package com.company.Lesson24;
		// implements реализуем данный интерфейс
public class Mi8 extends Helicopter implements VerticalTakeOFF{
	// через , указывать можно разные интерфейсы кроме VerticalTakeOFF
	@Override
	public void fly () {
		System.out.println ("\nВертолет МИ-8");
	}

			@Override
			public void verticalTakeOFF () {
				System.out.println ("Взлетает вертикально");

			}
		}
