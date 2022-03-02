import javax.xml.catalog.Catalog;

public class Main {


    public static void main(String[] args) {


        /* Создайте объект типа Cat(кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
            Присвойте каждому животному владельца (owner).*/

        Woman Anna = new Woman();

        Cat cat = new Cat();

        cat.owner = Anna;

        Dog dog = new Dog();

        dog.owner = Anna;

        Fish fish = new Fish();

        fish.owner = Anna;

    }

    public static class Cat{
        public Woman owner;
    }
    public static class Dog{
        public Woman owner;
    }
    public static class Fish{
        public Woman owner;
    }
    public static class Woman{

    }




}








