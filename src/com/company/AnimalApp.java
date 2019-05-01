package com.company;

public class AnimalApp {

    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());


        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());

        Mouse f = new Mouse();
        print(f.eat());
        print(f.sleep());
        print(f.squeaks());

        Dog k = new Dog();
        print(k.eat());
        print(k.sleep());
        print(k.bark());
    }

    private static void print(String s) {
        System.out.println(s);
    }
}