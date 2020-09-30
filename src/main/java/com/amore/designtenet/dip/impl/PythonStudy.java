package com.amore.designtenet.dip.impl;


import com.amore.designtenet.dip.IStudy;

public class PythonStudy implements IStudy {
    @Override
    public void study() {
        System.out.println("Python study");
    }
}
