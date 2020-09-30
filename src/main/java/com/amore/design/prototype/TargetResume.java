package com.amore.design.prototype;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import lombok.*;

import java.util.List;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-18 15:55
 * @since 七月
 */
@Setter
@Getter
@NoArgsConstructor
@ToString
public class TargetResume implements Cloneable{
    private String name;
    private String sex;
    private String age;
    private WorkExperience workExperience;
    private String company;
    private List<String> list;

    public TargetResume(String name) {
        this.name = name;
    }

    @SneakyThrows
    public Object clone() {
        //浅拷贝
//        return super.clone();
        //深拷贝
        return JSONObject.parseObject(JSONObject.toJSONString(this),this.getClass());
//        Gson gson = new Gson();
//        return gson.fromJson(gson.toJson(this),this.getClass());
    }
}
