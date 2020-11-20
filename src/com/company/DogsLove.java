package com.company;

public class DogsLove {
    static void WhatDoesHeLoves(ADog dog){
        if (dog.getName() == "Роланд") {
            System.out.print(dog.getName() + " в особенности");
        } else {
            System.out.print(dog.getName());
        }
        System.out.print(" любит бродить по улицам, особенно в центре города по причинам: ");
        for (EReasonToLove reasons : EReasonToLove.getReasons()) {
            System.out.printf("%s, ",reasons.getType());
        }
        System.out.print("которые улавливало только тонкое обоняние собак");
        System.out.println();
    }

}
