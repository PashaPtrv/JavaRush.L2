import javax.xml.catalog.Catalog;

public class Main {


    public static void main(String[] args){
   /*     //Создать объект типа Cat 2 раза.
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
    }

    public static class Cat {  */


        //Создать 3 объекта типа Dog (собака) и присвоить им имена "Max", "Bella", "Jack".
        Dog dog1 = new Dog();
        dog1.name = "Max";

        Dog dog2 = new Dog();
        dog2.name = "Bella";

        Dog dog3 = new Dog();

        dog3.name = "Jack";

        //Напиши программу, которая выводит на экран надпись:

        System.out.println("Мне так плохо! Хочу, чтобы все умерли!");


    }

    public static class Dog {

        public String name;

    }

}
