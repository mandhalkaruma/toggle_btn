package com.example.toggle_btn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb1, tb2;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }

    private void addListenerOnButtonClick() {
        submit = findViewById(R.id.submit);
        tb1 = findViewById(R.id.tb1);
        tb2 = findViewById(R.id.tb2);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb = new StringBuilder();
                sb.append("Select").append(tb1.getText());
                sb.append("Select").append(tb2.getText());
                Toast.makeText(getApplicationContext(),sb.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}