package com.company;

public class Main {

    public static void main(String[] args) {
        double numbers[] = {2.2, -0.21, 3.55, 88.1, 31.25};
        double sumOfPosNum = 0.0;
        int numOfNumbers = 0;

        for (double currentNumbers : numbers) {
            if (currentNumbers > 0) {
                sumOfPosNum = sumOfPosNum + currentNumbers;
                numOfNumbers++;
            } else {
                continue;
            }
        }
        for (double currentNumbers2 : numbers) {
            if (currentNumbers2 > 0) {
                sumOfPosNum = sumOfPosNum - currentNumbers2;
                numOfNumbers--;
            } else {
                break;
            }
        }
        System.out.println(sumOfPosNum / numOfNumbers);
    }
}
