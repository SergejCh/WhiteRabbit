package com.company;

import com.company.Lesson15.Constructor;
import com.company.Lesson21.Crow;
import com.company.Lesson21.Ostrich;
import com.company.Lesson23.AK47;
import com.company.Lesson23.Weapon;
import com.company.Lesson24.Boeing737;
import com.company.Lesson24.Mi8;
import com.company.Lesson24.Test;

public class Main {

    public static void main(String[] args) {
	// создаем экземпляр класса Constructor и обратимся к его методу
        Constructor constructor = new Constructor ();
        constructor.foo ();

        Ostrich ostrich = new Ostrich ();
        ostrich.walk ();
        ostrich.hideHead ();
        Crow crow = new Crow ();
        crow.fly ();

        ostrich.setName ("Страус");
        crow.setName ("Ворона");

        // Weapon weapon = new Weapon (); в абстрактном классе не создается главный объект
        AK47 ak47 = new AK47 ();
        ak47.show ();

        Mi8 mi8 = new Mi8 ();
        Boeing737 boeing737 = new Boeing737 ();

        Test test = new Test ();
        test.foo (mi8); // метод принимает потомок от FlyingObject
        mi8.verticalTakeOFF ();
        test.foo (boeing737);
        boeing737.flyOcean ();

    }
}
