package com.nhnaademy.app;

import org.apache.commons.math3.random.RandomDataGenerator;

public class Random {
    public static void main(String[] args) {
        RandomDataGenerator randomDataGenerator = new RandomDataGenerator();
        int randomNumber = randomDataGenerator.nextInt(1, 100);

        System.out.println("randomNumber : " + randomNumber);
    }
}
