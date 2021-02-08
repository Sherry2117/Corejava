package Multithreading;

import java.util.Date;

public class WorkerThread implements Runnable {

    private String message;
    public WorkerThread(String s) {
        this.message= s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"(Start)message = " +message+ "Start Date Time" + new Date());
        //sleep the thread for 2 seconds
        processMessage();//create methods by clicking the red light
        System.out.println(Thread.currentThread().getName() +"(End)" + new Date());
    }
     // method created
    private void processMessage() {
        try {
            Thread.sleep(2000); //2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
