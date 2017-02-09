package com.example.gembaf.sample2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }

    public void toTopPage(View view) {
        finish();
    }
}
