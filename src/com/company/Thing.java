package com.company;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return Objects.equals(type, thing.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "Thing{" +
                "type='" + type + '\'' +
                '}';
    }
}
