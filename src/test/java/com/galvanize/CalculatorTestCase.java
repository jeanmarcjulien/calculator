package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.galvanize.Calculator;

class CalculatorTestCase {

    @Test
    void testInitializedWith0() {

        //setup
        Calculator calculator;
        calculator = new Calculator();

        //execution
        int expected=0;
        int actual = calculator.getCurrentState();

        //assertion
        assertEquals(expected, actual);

        //teardown comment
    }

    @Test
    void testAddTwoNumbers() {

        //setup
        Calculator calculator;
        calculator = new Calculator();

        //execution
        int expected=5;
        int actual = calculator.addInputs(2,3);

        //assertion
        assertEquals(expected, actual);

        //teardown
    }

    @Test
    void testAddManyNumbers() {

        //setup
        Calculator calculator;
        calculator = new Calculator();

        //execution
        int expected=9;
        int actual = calculator.addInputs(1,3,5);

        //assertion
        assertEquals(expected, actual);

        //teardown
    }

    @Test
    void testMultiplyTwoNumbers() {

        //setup
        Calculator calculator;
        calculator = new Calculator();

        //execution
        int expected=15;
        int actual = calculator.multiplyInputs(3,5);

        //assertion
        assertEquals(expected, actual);

        //teardown
    }

    @Test
    void testMultiplyManyNumbers() {

        //setup
        Calculator calculator;
        calculator = new Calculator();

        //execution
        int expected=48;
        int actual = calculator.multiplyInputs(2,4,6);

        //assertion
        assertEquals(expected, actual);

        //teardown
    }


}
