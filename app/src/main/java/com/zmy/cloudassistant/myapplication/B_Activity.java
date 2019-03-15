package com.zmy.cloudassistant.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class B_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_);
    }

    public void onStartCClick(View view) {
        Intent intent = new Intent(B_Activity.this, C_Activity.class);
        startActivity(intent);
    }
}
