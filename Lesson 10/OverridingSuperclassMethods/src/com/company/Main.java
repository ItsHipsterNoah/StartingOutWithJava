package com.company;

public class Main {

    public static void main(String[] args) {
        CurvedActivity activity = new CurvedActivity(1.09);
        activity.setScore(89);
        System.out.println(activity.getRawScore());
        System.out.println(activity.getScore());
    }
}
