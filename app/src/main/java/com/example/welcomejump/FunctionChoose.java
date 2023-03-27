package com.example.welcomejump;

import android.os.Bundle;
import android.widget.Toast;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FunctionChoose extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.function_choose);
    }
    public void onClicked(View view) {
        Toast.makeText(this, "Click Here...", Toast.LENGTH_SHORT).show();
    }
}

