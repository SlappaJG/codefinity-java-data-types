package com.example;

public class Main {
    public static int sumStringNumbers(String[] numbers) {
        Integer[] result = new Integer[numbers.length];
        int sum = 0;
        
        for(int i = 0; i < result.length; i++){
            result[i] = Integer.parseInt(numbers[i]);
        }
        for(Integer number : result){
            sum += number;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        String[] numbers = {"10", "20", "30", "40"};
        int sum = sumStringNumbers(numbers);
        System.out.println("The sum is: " + sum);
    }
}
