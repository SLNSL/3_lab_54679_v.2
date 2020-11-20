package com.company;

import java.util.ArrayList;
import java.util.EnumSet;

public enum EReasonToLove {
    VOICE("Говор толпы"),
    NOISE("Шум автомобилей"),
    SMELL("Разнообразные запахи от прохожих");

    private String type;
    private static ArrayList<EReasonToLove> Reasons = new ArrayList<EReasonToLove>(EnumSet.allOf(EReasonToLove.class));


    EReasonToLove(String TypeOfReason){
        type = TypeOfReason;
    }

    public String getType() {
        return type;
    }

    public static ArrayList<EReasonToLove> getReasons() {
        return Reasons;
    }
}
