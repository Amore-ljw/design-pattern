package com.amore.designtenet.isp.impl;

import com.amore.designtenet.isp.IEatAnimal;
import com.amore.designtenet.isp.ISwimAnimal;

public class Dog implements IEatAnimal,ISwimAnimal {
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }
}
