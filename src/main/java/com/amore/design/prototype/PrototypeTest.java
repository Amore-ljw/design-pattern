package com.amore.design.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-18 15:59
 * @since 七月
 */
public class PrototypeTest {

    public static void main(String[] args) throws Exception {
        TargetResume resume = new TargetResume("ylc");
        resume.setAge("18");
        resume.setSex("wom");
        resume.setCompany("bj");
        resume.setWorkExperience(new WorkExperience("2000", "xxxx"));
        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        resume.setList(list);
        System.out.println(resume);
        System.out.println("==================");
        System.out.println(resume == resume.clone());
        System.out.println(resume.getList() == ((TargetResume)resume.clone()).getList());
        System.out.println(resume.getWorkExperience());
        System.out.println(((TargetResume) resume.clone()).getWorkExperience());
    }

}
