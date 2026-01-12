package com.example;

public class Main {
    public static String checkString(String input) {
        if(input == null)
        {
            return "Input is null.";
        }
        else{
            if(input.isEmpty())
                return "Input is empty.";
            else
                return "Input is: " + input;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkString(null));
        System.out.println(checkString(""));
        System.out.println(checkString("Hello world"));
        System.out.println(checkString("test123"));
    }
}
