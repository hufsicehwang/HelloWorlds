package com.example.helloworlds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text = findViewById(R.id.text);
        Button button = findViewById(R.id.button);
        Button button1 = findViewById(R.id.button_save);



        //현재 시간 출력 버튼
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                long now = System.currentTimeMillis();
                Date date = new Date(now);
                SimpleDateFormat timenow = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
                final String nowdate = timenow.format(date);
                text.setText(nowdate);
            }
        });
        //메모장 저장 버튼
        button1.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.edittext);
                final TextView textsave = findViewById(R.id.textview_save);
                textsave.setText(editText.getText());

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}