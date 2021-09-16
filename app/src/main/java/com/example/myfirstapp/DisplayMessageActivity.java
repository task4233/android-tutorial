package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        // intentに入っているMainActivityのStringを取得
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // textViewに入力されたテキストを設定
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}