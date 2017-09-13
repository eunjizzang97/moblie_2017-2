package com.example.sep06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void copy (View view) {

        EditText edit1 = (EditText) findViewById(R.id.editText);
        //edit1.getText();

        TextView text1 = (TextView) findViewById(R.id.textView);
        text1.setText(edit1.getText());
    }
}
