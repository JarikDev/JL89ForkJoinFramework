package com;

import java.util.Date;


public class Main {
    static long numOfOperations=100000000000L;
    public static void main(String[] args) throws Exception{
        System.out.println(new Date());
        long j=0;
        for (long i = 0; i < numOfOperations; i++) {
            j+=i;
        }
        System.out.println(j);
        System.out.println(new Date());
    }
}
