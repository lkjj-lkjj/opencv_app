package com.example.opencv_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.opencv.android.OpenCVLoader;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (OpenCVLoader.initDebug()) {
            Toast toast = Toast.makeText(getApplicationContext(), "opencv加载成功", Toast.LENGTH_SHORT);
            toast.show();
        }else {
            Toast toast = Toast.makeText(getApplicationContext(), "opencv加载失败", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}