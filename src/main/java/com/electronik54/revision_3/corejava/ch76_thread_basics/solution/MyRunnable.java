package com.electronik54.revision_3.corejava.ch76_thread_basics.solution;

/** Task as a Runnable - preferred because the class stays free to extend anything. */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("my-runnable ran on " + Thread.currentThread().getName());
    }
}