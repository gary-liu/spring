package com.mimi.syn.aqs;

public class Demo02 {
    private MyLock lock = new MyLock();
    private int m = 0;

    public static void main(String[] args) {
        Demo02 demo = new Demo02();
        new Thread(() -> {
            demo.a();
        }).start();
    }

    public void a() {
        lock.lock();
        System.out.println("a");
        b();
        lock.unlock();
    }

    public void b() {
        lock.lock();
        System.out.println("b");
        lock.unlock();
    }
}
