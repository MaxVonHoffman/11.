package com.example.projectdmain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.buttonright);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Moving.right();

            }
        });
    }
}