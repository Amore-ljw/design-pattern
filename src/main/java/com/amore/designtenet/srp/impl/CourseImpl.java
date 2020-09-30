package com.amore.designtenet.srp.impl;


import com.amore.designtenet.srp.ICourseInfo;
import com.amore.designtenet.srp.ICourseManager;

public class CourseImpl implements ICourseInfo,ICourseManager {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
