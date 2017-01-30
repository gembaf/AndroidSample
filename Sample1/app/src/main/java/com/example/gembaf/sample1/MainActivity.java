package com.example.gembaf.sample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view) {
        TextView result = (TextView) findViewById(R.id.resultTextView); // 結果
        TextView lhs = (TextView) findViewById(R.id.lhs);  // 左辺
        TextView rhs = (TextView) findViewById(R.id.rhs);  // 右辺

        int lhsNum = Integer.parseInt(lhs.getText().toString());
        int rhsNum = Integer.parseInt(rhs.getText().toString());
        int resultNum = lhsNum + rhsNum;

        result.setText(String.valueOf(resultNum));
    }
}
