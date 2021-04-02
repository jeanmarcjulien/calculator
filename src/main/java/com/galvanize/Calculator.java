package com.galvanize;

public class Calculator {
    public int getCurrentState() {
        return 0;
    }

    public int addInputs(int... numbers) {

        int sum =0;

        for(int i =0;i<numbers.length;i++){
            sum +=numbers[i];
        }
        return sum;
    }

    public int multiplyInputs(int... numbers) {

        int product =1;

        for(int i =0;i<numbers.length;i++){
            product *=numbers[i];
        }
        return product;
    }
}
