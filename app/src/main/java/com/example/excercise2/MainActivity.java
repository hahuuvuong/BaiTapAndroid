package com.example.excercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtSoA;
    EditText edtSoB;
    TextView result;
    Button btnTong;
    Button btnXoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setEvent() {
        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a,b,c;
                a = Float.parseFloat(edtSoA.getText().toString());
                b = Float.parseFloat(edtSoB.getText().toString());
                c = a + b;
                result.setText("Tổng 2 số là: "+c);
                result.setBackgroundColor(Color.GREEN);
            }
        });
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtSoA.setText("");
                edtSoB.setText("");
            }
        });
    }

    private void setControl() {
        btnTong = findViewById(R.id.btn_Tong);
        btnXoa = findViewById(R.id.btn_Xoa);
        result = findViewById(R.id.textView3);
        edtSoA = findViewById(R.id.et_SOA);
        edtSoB = findViewById(R.id.et_SOB);
    }

}
