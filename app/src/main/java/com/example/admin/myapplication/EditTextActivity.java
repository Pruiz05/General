package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity implements View.OnClickListener {

    EditText meditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        meditText = (EditText) findViewById(R.id.my_edit_text);
       // findViewById(R.id.btnEditText);
        findViewById(R.id.my_btn).setOnClickListener(this);
        /*
                mEditText = (EditText) findViewById(R.id.my_edit_text);
                    findViewById(R.id.my_button).setOnClickListener(this);
                    btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent intent = new Intent(ScrollVIewActivity.this, ImageViewActivity.class);
                startActivity(intent);
            }
        });
        */



    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this, meditText.getText(), Toast.LENGTH_SHORT).show();
    }
}
