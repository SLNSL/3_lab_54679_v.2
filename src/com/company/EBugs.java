package com.company;

public enum EBugs {
    СRICKET("Сверчок"),
    GRASSHOPPER("Кузнечик"),
    FLY("Муха");

    private String type;

    EBugs(String type_) {
        type = type_;
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
