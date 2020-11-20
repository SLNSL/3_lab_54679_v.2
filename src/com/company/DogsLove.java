package com.company;

public class DogsLove {
    static void WhatDoesHeLoves(ADog dog){
        System.out.print(dog.getName() + " любит бродить по улицам, особенно в центре города по причинам: ");
        for (EReasonToLove reasons : EReasonToLove.getReasons()) {
            System.out.printf("%s, ",reasons.getType());
        }
        System.out.println();
    }

}
