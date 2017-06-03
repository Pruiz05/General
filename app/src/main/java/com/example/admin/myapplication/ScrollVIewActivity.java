package com.example.admin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScrollVIewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);



        //LinearLayout
        Button btn = (Button) findViewById(R.id.btnLin);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScrollVIewActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
        //FrameLayout
        Button btn2 = (Button) findViewById(R.id.btnFrame);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScrollVIewActivity.this, Main5Activity.class);
                startActivity(intent);
            }
        });
        //btnTable
        Button btn3 = (Button) findViewById(R.id.btnTable);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScrollVIewActivity.this, Main4Activity.class);
                startActivity(intent);
            }
        });
        //
        Button btn4 = (Button) findViewById(R.id.btnImageView);
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent intent = new Intent(ScrollVIewActivity.this, ImageViewActivity.class);
                startActivity(intent);
            }
        });
        //
        Button btn5 = (Button) findViewById(R.id.btnEditText);
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent intent = new Intent(ScrollVIewActivity.this, EditTextActivity.class);
                startActivity(intent);
            }
        });
    }
}

