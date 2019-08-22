package com.company.Thread;

public class Calculator implements Runnable {

    public Calculator(){

    }

    @Override
    public void run() {
        long current =1L;
        long max = 10000L;
        long numPrimes = 0L;

        System.out.printf("Thread start", Thread.currentThread().getName());
        while(current <=max){
            if(isPrime(current)) {
                numPrimes++;
            }
            current++;
        }
        System.out.printf("Thread END ", Thread.currentThread().getName(), numPrimes);
    }

    private boolean isPrime(long number) {
        if( number <- 2) {
            return true;
        }
        for(long i =2; i<number;i++){
            if((number%i)==0){
                return false;
            }
        }
        return true;
    }
}
