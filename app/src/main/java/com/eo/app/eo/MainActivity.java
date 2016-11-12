package com.eo.app.eo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.eo.app.eo.calculator.CalculatorActivity;
import com.eo.app.eo.member.activity.JoinActivity;
import com.eo.app.eo.member.activity.LoginActivity;

public class MainActivity extends AppCompatActivity implements TextView.OnClickListener {

    Button bt_login,bt_join, bt_calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_login = (Button) findViewById(R.id.bt_login);
        bt_join = (Button) findViewById(R.id.bt_join);
        bt_calculator = (Button) findViewById(R.id.bt_calculator);
        bt_login.setOnClickListener(this);
        bt_join.setOnClickListener(this);
        bt_calculator.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(bt_login.getId()==v.getId()){
            Intent i = new Intent(this.getApplicationContext(),LoginActivity.class);
            this.startActivity(i);
        }
        if(bt_join.getId()==v.getId()){
            Intent i = new Intent(this.getApplicationContext(),JoinActivity.class);
            this.startActivity(i);
        }
        if(bt_calculator.getId()==v.getId()){
            Intent i = new Intent(this.getApplicationContext(),CalculatorActivity.class);
            this.startActivity(i);
        }
    }
}

