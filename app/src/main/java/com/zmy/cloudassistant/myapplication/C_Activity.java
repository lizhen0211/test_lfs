package com.zmy.cloudassistant.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class C_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_);
    }

    public void onStartMainClick(View view) {
        Intent intent = new Intent(C_Activity.this, MainActivity.class);
        startActivity(intent);
    }
}
