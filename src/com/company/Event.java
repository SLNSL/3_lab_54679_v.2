package com.company;


import java.util.Objects;

public abstract class Event {
    private static String type = " Завтрак";
    public static void end(String nameOfEvent){
        System.out.print("Событие ");
        Action.doing(type , " завершилось");
    }
    public static void ends(String nameOfEvent){
        end(nameOfEvent);
        check();
    }
    public static void starts(String nameOfEvent){
        System.out.print("Событие ");
        type = nameOfEvent;
        Action.doing(type , " началось");
    }

    public static void check(){
        switch (type){
            case ("Обед"):
                ASomeone.setEmotion("сытый");
            case ("Физ-зарядка"):
                ADog.setEmotion("с хорошим самочувствием");
        }
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
        Event event = (Event) o;
        return Objects.equals(type, event.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "Event{" +
                "type='" + type + '\'' +
                '}';
    }
}
