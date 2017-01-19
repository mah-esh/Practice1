package com.andro.mahesh.activity_intent_prac_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by mahes on 1/19/2017.
 */
public class SecondActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        TextView textView = (TextView) findViewById(R.id.text_view1);

        StringBuilder msg = new StringBuilder("Welcome  \n " );
        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if(b.containsKey(Constants.KEY_NAME)){
            String name = b.getString(Constants.KEY_NAME, "maheswara reddy.s");
            msg.append(name);
        }
        if(b.containsKey(Constants.KEY_AGE)){
            Double age = b.getDouble(Constants.KEY_AGE, 25);
            msg.append(" \n age is ");
            msg.append("\n").append(age).append(" Years old");

        }


        textView.setText(msg);
    }
}
