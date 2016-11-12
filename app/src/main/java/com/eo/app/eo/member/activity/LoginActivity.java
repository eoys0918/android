package com.eo.app.eo.member.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.eo.app.eo.R;
import com.eo.app.eo.member.MemberService;
import com.eo.app.eo.member.MemberServiceImpl;

public class LoginActivity extends AppCompatActivity {
    MemberService memberService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        memberService = new MemberServiceImpl(this.getApplicationContext());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
