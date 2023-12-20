package com.test;

 class ThreadLifecycleExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread is terminating.");
        });
        System.out.println("Thread is in the New state.");
        thread.start();
        System.out.println("Thread is in the Runnable state.");
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread is in the Timed Waiting state.");
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread is in the Terminated");
}}
