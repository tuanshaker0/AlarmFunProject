package com.app.gdo.alarmfunproject;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.app.gdo.alarmfunproject.contact.ContactActivity;
import com.app.gdo.alarmfunproject.setting.SettingActivity;


public class HomeActivity extends Activity {

    private TextView mTextViewAlarm, mTextViewGDO;
    private LinearLayout mLayoutCost, mLayoutManage, mLayoutContact, mLayoutSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
    }

    /**
     * init view of screen.
     */
    private void initView() {
        mTextViewAlarm = (TextView) findViewById(R.id.textViewAlarm);
        mTextViewGDO = (TextView) findViewById(R.id.textViewGDO);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/bunny$mambo.ttf");
        Typeface font1 = Typeface.createFromAsset(getAssets(), "fonts/GlamourGirl.ttf");
        mTextViewAlarm.setTypeface(font);
        mTextViewGDO.setTypeface(font1);

        mLayoutCost = (LinearLayout) findViewById(R.id.layoutCost);
        mLayoutManage = (LinearLayout) findViewById(R.id.layoutTaskManager);
        mLayoutContact = (LinearLayout) findViewById(R.id.layoutContact);
        mLayoutSetting = (LinearLayout) findViewById(R.id.layoutSetting);
        mLayoutCost.setOnClickListener(mOnClickLayoutCost);
        mLayoutManage.setOnClickListener(mOnClickLayoutManage);
        mLayoutContact.setOnClickListener(mOnClickLayoutContact);
        mLayoutSetting.setOnClickListener(mOnClickLayoutSetting);
    }

    View.OnClickListener mOnClickLayoutCost = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    View.OnClickListener mOnClickLayoutManage = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    View.OnClickListener mOnClickLayoutContact = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(HomeActivity.this, ContactActivity.class));
        }
    };

    View.OnClickListener mOnClickLayoutSetting = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(HomeActivity.this, SettingActivity.class));
        }
    };
}
