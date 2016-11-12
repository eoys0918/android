package com.eo.app.eo.calculator;

/**
 * Created by 1027 on 2016-11-05.
 */

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public double add(CalculatorDTO param) {
        return param.getFirst()+param.getSecond();
    }

    @Override
    public double subtract(CalculatorDTO param) {
        return param.getFirst()-param.getSecond();
    }

    @Override
    public double multi(CalculatorDTO param) {
        return param.getFirst()*param.getSecond();
    }

    @Override
    public double divide(CalculatorDTO param) {
        return param.getFirst()/param.getSecond();
    }

    @Override
    public double mod(CalculatorDTO param) {
        return param.getFirst()%param.getSecond();
    }
}
