package com.zyang.baseDate;

public class Person {
    private int person_id;
    private String person_code;
    private String person_name;

    public Person() {

    }

    public Person(String person_code, String person_name) {
        this.person_code = person_code;
        this.person_name = person_name;
        return;
    }

    public Person(int person_id, String person_code, String person_name) {
        this.person_id = person_id;
        this.person_code = person_code;
        this.person_name = person_name;
    }



    public int getPerson_id() {
        return person_id;
    };

    public String getPerson_code() {
        return person_code;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public void setPerson_code(String person_code) {
        this.person_code = person_code;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }
}
