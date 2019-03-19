package com.iluwatar.mybuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by feng.dc on 2019/3/19.
 */
public class Computer {
    List<String> parts = new ArrayList<>();
    
    public void show(){
        for (String part: parts) {
            System.out.print(part);
            System.out.print("--");
        }
    }
}
