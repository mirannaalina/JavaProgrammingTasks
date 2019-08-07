package com.company.Tasks;

//The task is to count numbers that have all the digits the same from the given range [a, b].
// Both ends are included. If number has only one digit it is of course included also.

public class Same {

    public static void main(String[] args) {

        int numbers[] = {1,2,3,3,4,4,5,8};

        Same s = new Same();
        s.duplicate(numbers,8);

    }

    public static void duplicate(int numbers[], int size){

        for(int i =0 ; i<size ; i++){
            boolean duplicate = false;
            int b =0 ;
            while(b<i){
                if(numbers[i] == numbers[b])
                    duplicate = true;
                b++;}
                if(duplicate ==false)
                    System.out.println(numbers[i]);
            }
        }

}
