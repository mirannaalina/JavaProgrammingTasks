package com.company.Thread;
import com.company.LAMBDA.T;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Thread.State;

public class Main {
    public static void main(String[] args) {

        System.out.printf("minimum priority: %s", Thread.MIN_PRIORITY);
        System.out.printf("Normal priority: %s", Thread.NORM_PRIORITY);
        System.out.printf("Maximum priority: %s", Thread.MAX_PRIORITY);

        Thread threads[];
        State status[];

        threads = new Thread[10];
        status = new State[10];

        for(int i=0; i<10;i++){
            threads[i] = new Thread(new Calculator());
            if((i %2)==0){
                threads[i].setPriority(Thread.MAX_PRIORITY);
            }else{
                threads[i].setPriority(Thread.MIN_PRIORITY);
            }
            threads[i].setName("My thread"+ i + "with priority " + threads[i].getPriority());
        }

        try (FileWriter file = new FileWriter("C:\\Users\\A737860\\Desktop\\New.txt");
        PrintWriter pw =  new PrintWriter(file);) {

            for(int i=0;i<10;i++){
                pw.println("Main : status of thread " +i +":" + threads[i].getState());
                status[i] = threads[i].getState();
            }
            for(int i=0;i<10;i++){
                threads[i].start();
            }
            boolean finish =false;
            while(!finish){
                for (int i=0;i<10;i++){
                    if(threads[i].getState() != status[i]) {
                        writeThreadInfo(pw, threads[i], status[i]);
                        status[i] = threads[i].getState();

                    }
                }

                finish = true;
                for(int i= 0; i<10;i++){
                    finish = finish && (threads[i].getState() == State.TERMINATED);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private static void writeThreadInfo(PrintWriter pw, Thread thread, State state) {
        pw.printf("Main: Id %d - %s", thread.getId(),thread.getName());
    }
}
