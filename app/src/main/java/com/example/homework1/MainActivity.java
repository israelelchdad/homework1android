package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    private TextView t1;
    private TextView t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        t1=findViewById(R.id.textview1);
        t2=findViewById(R.id.textView2);

    }

    public void chenge(View view) {
//        t2.setText(t1.getText());
        TextView t3=(TextView)view;
        t2.setText(t3.getText());
    }

    public void chengetext(View view) {
        TextView t4=(TextView)view;
//        t2.setText(t4.getText());
        CharSequence s=t4.getText();
        t2.setText( "hello  " +s);

    }
}
