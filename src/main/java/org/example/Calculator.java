package org.example;

public class Calculator {

    public int Add(int a, int b) {
        return a + b;
    }

    public int Divide(int a, int b) {
        if (b == 0) {
            // Testin beklediği hatayı burada fırlatıyoruz
            throw new ArithmeticException("Sıfıra bölme hatası!");
        }
        return a / b;
    }
}
