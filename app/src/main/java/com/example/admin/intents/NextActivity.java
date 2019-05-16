package com.example.admin.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        TextView t=findViewById(R.id.tv);
        Bundle bd=getIntent().getExtras();
        String msg=bd.getString("message");
        t.setText(msg);
    }
}
