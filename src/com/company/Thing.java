package com.company;

public class Thing {
    private String type;
    Thing(String type_){
        type = type_;
        System.out.println("Предмет " + getType() + " создан");
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
