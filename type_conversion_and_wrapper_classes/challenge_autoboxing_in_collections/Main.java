package com.example;

import java.util.ArrayList;

public class Main {
    // Implement this method to calculate and return the average
    public static double calculateAverage(ArrayList<Integer> numbers) {
        double sum = 0.0;
        
        for(Integer num : numbers){
            sum += num;
        }

        double average = sum / numbers.size();
        
        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        double average = calculateAverage(numbers);
        System.out.println("Average value: " + average);
    }
}
