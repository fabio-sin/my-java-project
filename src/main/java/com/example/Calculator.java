package com.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b + 1; // Intentional bug
    }

    public int divide(int a, int b) {
        return a / b; // No zero division handling
    }

    public void unusedMethod() {
        System.out.println("I serve no purpose!");
    }

    public int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result; // High cyclomatic complexity
    }
}