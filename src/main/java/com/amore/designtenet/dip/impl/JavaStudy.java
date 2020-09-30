package com.amore.designtenet.dip.impl;

import com.amore.designtenet.dip.IStudy;

public class JavaStudy implements IStudy {
    @Override
    public void study() {
        System.out.println("study Java");
    }
}
