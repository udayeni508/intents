package com.example.admin.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void send(View view){
        Button btn=findViewById(R.id.bt);
        EditText edt=findViewById(R.id.et);
        Intent i = new Intent(this,NextActivity.class);
        i.putExtra("message",edt.getText().toString());
        startActivity(i);
    }
    public void something(View view){
        switch (view.getId()){
            case R.id.bt1:
                Intent i1=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
                startActivity(i1);
                break;
        }
    }
  }
