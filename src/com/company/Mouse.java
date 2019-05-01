package com.company;
/*
*All mice are Animals but all Animals are not mice
 */
public class Mouse extends Animal{

    public Mouse(){
        super();
        System.out.println("Now I am a mouse");
    }
    @Override
    public String sleep(){
        return "A mouse sleeps...";
    }
    @Override
    public String eat(){
        return "A mouse eats...";
    }
    public String squeaks(){
        return "A mouse squeaks...";
    }
}
