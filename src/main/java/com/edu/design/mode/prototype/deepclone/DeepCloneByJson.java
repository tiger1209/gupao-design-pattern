package com.edu.design.mode.prototype.deepclone;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

public class DeepCloneByJson {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setUserName("张三");
        u1.setAge(23);
        u1.setHobbies(Arrays.asList("footbll","pingpong"));

        JSON.toJSON(u1);
    }
}
