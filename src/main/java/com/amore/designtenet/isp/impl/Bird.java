package com.amore.designtenet.isp.impl;


import com.amore.designtenet.isp.IEatAnimal;
import com.amore.designtenet.isp.IFlyAnimal;

public class Bird implements IEatAnimal,IFlyAnimal {
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
