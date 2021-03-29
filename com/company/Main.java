package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        m.abc("yes","yes","no","da","yes","net","net","net","no","no","da","da");
    }

    private ArrayList<String> abc(String ... values){
        ArrayList<String> list = new ArrayList<>();
        for (String s : values) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        return list;
    }
}
