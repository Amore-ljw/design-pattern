package com.amore.designtenet.srp;

//接口拆分:对职责进行解耦
public interface ICourseInfo {

    //获取基本信息
    String getCourseName();

    //获得视屏流
    byte[] getCourseVideo();

}
