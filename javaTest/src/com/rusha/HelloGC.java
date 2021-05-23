package com.rusha;

import java.util.Arrays;

public class HelloGC {

    public static void main(String[] args) throws Exception{
        System.out.println("#####xx");
        a(1);
        a(1);
        new  HelloGC().a(1);
        Thread.sleep(Integer.MAX_VALUE);

        int[] i = new int[]{2,3,2};


    }

    public static void a(int ab){
        System.out.println(ab);
    }
}
