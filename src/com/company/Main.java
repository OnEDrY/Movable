package com.company;


import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        MovableCircle mc = new MovableCircle();

        mc.setX(1);
        mc.setY(2);
        mc.setRadius(12);
        mc.setxSpeed(25);
        mc.setySpeed(20);
        mc.moveRight();
        mc.moveDown();


        System.out.println(mc.toString());
    }

}
