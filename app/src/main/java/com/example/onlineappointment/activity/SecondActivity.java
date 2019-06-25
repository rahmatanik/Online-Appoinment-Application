package com.example.onlineappointment.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.onlineappointment.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void gotoNewActivity3(View view) {
        Toast.makeText(SecondActivity.this, "Welcome To Our Community", Toast.LENGTH_SHORT).show();
    }
}
