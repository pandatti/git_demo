package com.zyang.baseDate;

public class Employee {
    private  int user_id;
    private  String user_code;
    private String user_name;

    public Employee() {
        System.out.println(">>>>>>>>>>>>>>无参构造器开始执行...>>>>>>>>>>>>>>");
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
