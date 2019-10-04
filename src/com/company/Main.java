package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> basicList=new ArrayList<>();
        ArrayList<String> nList=new ArrayList<>();
        basicList.add(5);
        basicList.add(5);
        basicList.add(4);
        basicList.add(0);
        basicList.add(3);
        basicList.add(2);
//        basicList.add(3);
//        basicList.add(0);
//        basicList.add(2);
        int number=1;
        int i=1;

        for(int k=1;k<basicList.size();k++){
            System.out.print(basicList.get(k)+ " ");
        }
        System.out.println(" ");
        while(number!=0){
            number=basicList.get(i);
            nList.add(Integer.toString(i));
            i=number;
        }
        Collections.reverse(nList);
        System.out.println(nList);

    }
}
