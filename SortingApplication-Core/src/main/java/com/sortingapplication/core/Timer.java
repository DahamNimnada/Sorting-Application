package com.sortingapplication.core;

import java.util.concurrent.TimeUnit;

public class Timer {

    static long startTime;
    static long endTime;

    public static void setStartTime(){
        startTime = System.nanoTime();
        //System.out.println(startTime);
    }

    public static void setEndTime() {
        endTime = System.nanoTime();
        //System.out.println(startTime);
    }

    public static void totalTime (){
        long totalTime = TimeUnit.MILLISECONDS.convert(endTime - startTime, TimeUnit.NANOSECONDS);
        System.out.println("Time Elapsed - "+ totalTime+" Milli Seconds");
    }
}
