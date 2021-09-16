package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        // thisとDisplayMessageActivityクラスをバインドするintentを追加
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        // editTextというオブジェクトを見つける
        EditText editText = (EditText)findViewById(R.id.editTextTextPersonName);

        // editTextのテキストを取得
        String message = editText.getText().toString();

        // intentに追加する
        intent.putExtra(EXTRA_MESSAGE, message);

        // 追加したものを適用する？
        startActivity(intent);
    }
}