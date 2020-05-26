package com.revature.logic;

public class Calculator {
    public int divide(int input1, int input2){
        try{
            return input1/input2;
        } catch (ArithmeticException ex){
            throw ex;
        }
    }
}
