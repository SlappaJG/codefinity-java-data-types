package com.example;

public class Main {
    // Implement this method
    public static void safeDoubleToInt(double value) {

        int newValue = (int) value;
        
        System.out.println("Original double value: " + value);
        System.out.println("Converted int value: " + newValue);

        if(value != newValue)
            System.out.println("Warning: Data loss occurred during conversion.");
        
    }

    public static void main(String[] args) {
        safeDoubleToInt(42.7);
    }
}
