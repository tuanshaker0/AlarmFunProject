package com.app.gdo.alarmfunproject.user;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.app.gdo.alarmfunproject.HomeActivity;
import com.app.gdo.alarmfunproject.R;


public class LoginActivity extends Activity {

    private TextView mTextViewForgetPassWord, mTextViewRegister;
    private Button mButtonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    /**
     * init view of login screen.
     */
    private void initView() {
        mTextViewForgetPassWord = (TextView) findViewById(R.id.textViewForgetPassword);
        mTextViewRegister = (TextView) findViewById(R.id.textViewRegister);
        mButtonLogin = (Button) findViewById(R.id.buttonLogin);
        mTextViewRegister.setOnClickListener(mOnClickTextViewRegister);
        mButtonLogin.setOnClickListener(mOnClickButtonLogin);
    }

    private View.OnClickListener mOnClickTextViewRegister = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
        }
    };

    private View.OnClickListener mOnClickButtonLogin = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(LoginActivity.this, HomeActivity.class));
        }
    };
}
