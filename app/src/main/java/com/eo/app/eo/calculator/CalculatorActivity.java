package com.eo.app.eo.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.eo.app.eo.R;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {
    EditText et_first,et_second;
    Button bt_add,bt_subtract,bt_multi,bt_divide,bt_mod,bt_result;
    TextView tv_result;
    CalculatorService calculatorService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        calculatorService = new CalculatorServiceImpl();
        et_first = (EditText) findViewById(R.id.et_first);
        et_second = (EditText) findViewById(R.id.et_second);
        bt_add = (Button) findViewById(R.id.bt_add);
        bt_subtract = (Button) findViewById(R.id.bt_subtract);
        bt_multi = (Button) findViewById(R.id.bt_multi);
        bt_divide = (Button) findViewById(R.id.bt_divide);
        bt_mod = (Button) findViewById(R.id.bt_mod);
        bt_result = (Button) findViewById(R.id.bt_result);
        tv_result = (TextView) findViewById(R.id.tv_result);
        bt_add.setOnClickListener(this);
        bt_subtract.setOnClickListener(this);
        bt_multi.setOnClickListener(this);
        bt_divide.setOnClickListener(this);
        bt_mod.setOnClickListener(this);
        bt_result.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Double firstNum = Double.parseDouble(et_first.getText().toString());
        Double secondNum = Double.parseDouble(et_second.getText().toString());
        CalculatorDTO param = new CalculatorDTO(firstNum,secondNum);
        Double result = null;
        switch (v.getId()){
            case R.id.bt_add:
                result = calculatorService.add(param);
                break;
            case R.id.bt_subtract:
                result = calculatorService.subtract(param);
                break;
            case R.id.bt_multi:
                result = calculatorService.multi(param);
                break;
            case R.id.bt_divide:
                result = calculatorService.divide(param);
                break;
            case R.id.bt_mod:
                result = calculatorService.mod(param);
                break;
        }
        if (result!=null){
            tv_result.setText("Result : "+result.toString());
        }else{
            tv_result.setText("Result : ");
        }
    }
}