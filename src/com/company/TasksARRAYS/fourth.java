package com.company.TasksARRAYS;

//write a java program to find missing number in an array

public class fourth {

    public static void main(String[] args) {

        int[] tr = {1,2,3,4,5,7}; //6 is missing   (array-ul meu contne 6 elemente

        int lenghtt = 7; //ii zici cat de mare trebuie sa fie array-ul (in cazul nostru 7 elemente)

        int idealsum= (lenghtt *(lenghtt+1)) /2;  //(7*(7+1) /2
        int sum = calculatesum(tr);  //suma ( intra in metoda si aduna toate elementele sum=sum+arr

        int missingnr = idealsum -sum; //afli nr lista prin idealsum-sum
        System.out.println(missingnr);

    }
    public static int calculatesum(int[] tr){
        int sum =0;
        for(int nr : tr){
            sum= sum+nr;
        }
        return sum;
    }
}
