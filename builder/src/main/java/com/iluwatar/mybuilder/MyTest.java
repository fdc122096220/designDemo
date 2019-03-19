package com.iluwatar.mybuilder;


/**
 * Created by feng.dc on 2019/3/19.
 */
public class MyTest {
    public static void main(String[] args){
        Builder lowBuilder = new LowComputerBuilder();
        Builder superBuilder = new SuperComputerBuilder();
        Director director = new Director();
        director.buibuibuilder(lowBuilder);
        lowBuilder.getComputer().show();
        System.out.println("=======================================>");
        director.buibuibuilder(superBuilder);
        superBuilder.getComputer().show();
    }
}
