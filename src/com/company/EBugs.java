package com.company;

public enum EBugs {
    СRICKET("Сверчок"),
    GRASSHOPPER("Кузнечик"),
    FLY("Муха");

    private String type;

    EBugs(String Type) {
        type = Type;
    }


    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "EBugs{" +
                "type='" + type + '\'' +
                '}';
    }
}
