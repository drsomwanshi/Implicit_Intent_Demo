package com.example.implicit_intent_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fun1(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.cocsit.org.in"));
        startActivity(i);
    }
    public void fun2(View view) {

        Uri uri=Uri.parse("tel:8329449098");
        Intent i=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(i);

    }
}