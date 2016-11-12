package com.eo.app.eo.calculator;

/**
 * Created by 1027 on 2016-11-05.
 */

public interface CalculatorService {
    public double add(CalculatorDTO param);
    public double subtract(CalculatorDTO param);
    public double multi(CalculatorDTO param);
    public double divide(CalculatorDTO param);
    public double mod(CalculatorDTO param);
}
