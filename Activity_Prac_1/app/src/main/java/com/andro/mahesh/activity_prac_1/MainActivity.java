package com.andro.mahesh.activity_prac_1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = MainActivity.class.getSimpleName();


    private RelativeLayout relativeLayout ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.button_1);
        Button b2 = (Button) findViewById(R.id.button_2);
        relativeLayout = (RelativeLayout) findViewById(R.id.activity_main);

        /*b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setBackgroundColor(Color.GREEN);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i1);
            }
        });*/

        b1.setOnClickListener(MainActivity.this);
        b2.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_1:
                relativeLayout.setBackgroundColor(Color.MAGENTA);
                break;

            case R.id.button_2:
                Intent i1 = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i1);
        }
    }
}
