package com.mimi.syn.volat;

public class ShutDowsnDemmo extends Thread{
    private volatile boolean started=false;

    @Override
    public void run() {
        while(started){

        }
    }
    public void shutdown(){
        started=false;
    }
}
