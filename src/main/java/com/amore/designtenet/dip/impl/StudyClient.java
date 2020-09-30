package com.amore.designtenet.dip.impl;


import com.amore.designtenet.dip.IStudy;

public class StudyClient {

    public void study(IStudy study){
        study.study();
    }


    private IStudy study;
    //set注入
    public void setStudy(IStudy study) {
        this.study = study;
    }

    public StudyClient() {
    }
    //构造器注入
    public StudyClient(IStudy study) {
        this.study = study;
    }

    public void study(){
        study.study();
    }

}
