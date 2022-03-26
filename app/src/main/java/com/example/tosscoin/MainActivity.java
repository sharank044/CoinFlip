package com.example.tosscoin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView lastEditText;
        button = (Button) findViewById(R.id.button);
        lastEditText = (TextView) findViewById(R.id.edtext);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lastEditText.setText(bool());
            };
        });

    }
    String bool(){
        String result;
        if(toast() % 2 == 0) result = "Heads";
        else {
            result = "Tails";
        }
        return result;
    }
    public int toast()
    {
        Random rand = new Random();
        int num = rand.nextInt();
        return num;
    }
}