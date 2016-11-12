package com.eo.app.eo.calculator;

/**
 * Created by 1027 on 2016-11-05.
 */

public class CalculatorDTO {
    private double first,second;
    public  CalculatorDTO(){
    }
    public  CalculatorDTO(double first,double second){
        setFirst(first);
        setSecond(second);
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public double getFirst() {

        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }
}
