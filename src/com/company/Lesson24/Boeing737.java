package com.company.Lesson24;

public class Boeing737 extends Aircraft{
	@Override
	public void fly () {
		System.out.println ("Лайнер Боинг-737");
	}

	@Override
	public void flyOcean(){
		System.out.println ("Боинг-737 летает через Атлантический океан");
	}
}
