package com.revature.logic;

import org.junit.Test;

public class CalculatorTest {
    @Test(expected = ArithmeticException.class)
    public void divideShouldReturnException(){
        Calculator test = new Calculator();
        test.divide(1,0);
    }
}
