package com.electronik54.revision_3.corejava.ch76_thread_basics.solution;

/** Task by extending Thread - simpler but uses up the single inheritance slot. */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(getName() + " (extends Thread) ran");
    }
}