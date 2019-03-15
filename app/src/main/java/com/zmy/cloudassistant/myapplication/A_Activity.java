package com.zmy.cloudassistant.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class A_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_);
    }

    public void onStartBClick(View view) {
        Intent intent = new Intent(A_Activity.this, B_Activity.class);
        startActivity(intent);
    }
}
