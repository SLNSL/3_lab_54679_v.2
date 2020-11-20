package com.company;

import java.util.Objects;

public abstract class ASomeone implements IHasName{
    private String name;
    private static String Emotion;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String NameOfSomeone) {
        this.name = NameOfSomeone;
    }

    public static void setEmotion(String emotion) {
        Emotion = emotion;
    }

    public static String getEmotion() {
        return Emotion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ASomeone aSomeone = (ASomeone) o;
        return Objects.equals(name, aSomeone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "ASomeone{" +
                "name='" + name + '\'' +
                '}';
    }
}
