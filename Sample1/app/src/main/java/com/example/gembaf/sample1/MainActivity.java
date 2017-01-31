package com.example.gembaf.sample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result; // 結果
    TextView lhs;  // 左辺
    TextView rhs;  // 右辺
    RadioGroup operations; // 四則演算の選択肢

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.resultTextView);
        lhs = (TextView) findViewById(R.id.lhs);
        rhs = (TextView) findViewById(R.id.rhs);
        operations = (RadioGroup) findViewById(R.id.operationsRadioGroup);
    }

    public void calculate(View view) {
        int lhsNum = Integer.parseInt(lhs.getText().toString());
        int rhsNum = Integer.parseInt(rhs.getText().toString());
        int resultNum = 0;

        switch (operations.getCheckedRadioButtonId()) {
            case R.id.add: resultNum = lhsNum + rhsNum; break;
            case R.id.sub: resultNum = lhsNum - rhsNum; break;
            case R.id.mlt: resultNum = lhsNum * rhsNum; break;
            case R.id.div: resultNum = lhsNum / rhsNum; break;
        }
        result.setText(String.valueOf(resultNum));
    }
}
