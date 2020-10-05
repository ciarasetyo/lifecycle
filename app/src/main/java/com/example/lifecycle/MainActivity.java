package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "mainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView changeWord = (TextView) findViewById(R.id.textView);
        changeWord.setText(changeWord.getText() + "\nonCreate");
        Log.i(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        TextView changeWord = (TextView) findViewById(R.id.textView);
        changeWord.setText(changeWord.getText() + "\nonStart");
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        TextView changeWord = (TextView) findViewById(R.id.textView);
        changeWord.setText(changeWord.getText() + "\nonResume");
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        TextView changeWord = (TextView) findViewById(R.id.textView);
        changeWord.setText(changeWord.getText() + "\nonPause");
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        TextView changeWord = (TextView) findViewById(R.id.textView);
        changeWord.setText(changeWord.getText() + "\nonStop");
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        TextView changeWord = (TextView) findViewById(R.id.textView);
        changeWord.setText(changeWord.getText() + "\nonDestroy");
        super.onDestroy();
        Log.i(TAG, "onDestroy"); // kemungkinan fungsi onDestroy hanya bisa dilihat di logcat
     // karena aplikasi akan keluar sebelum tulisan onDestroy dapat dilihat pada layar simulator HP
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        TextView changeWord = (TextView) findViewById(R.id.textView);
        changeWord.setText(changeWord.getText() + "\nonRestart");
        Log.i(TAG, "onRestart");
    }

    public void openActivity2(View v){
        Intent intent =new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}