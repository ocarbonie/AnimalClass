package com.company;
/*
 *All mice are Animals but all Animals are not mice
 */
public class Dog extends Animal {

    public Dog(){
        super();
        System.out.println("Now I am a dog");
    }

    @Override
    public String eat() {
        return "A dog eats...";
    }
    @Override
    public String sleep(){
        return "A dog sleep...";
    }
    public String bark(){
        return" A dog barks...";
    }
}
