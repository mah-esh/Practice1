package com.andro.mahesh.activity_intent_prac_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.edit_text1);
        button1 = (Button) findViewById(R.id.button_1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //moveToSecondActivity_FirstWay();
                moveToSecondActivity_SecondWay();
            }
        });

    }

    private void moveToSecondActivity_FirstWay() {

        Intent intent1 = new Intent(MainActivity.this, SecondActivity.class);

        Bundle b1 =  new Bundle();
        b1.putString(Constants.KEY_NAME,editText1.getText().toString());
        b1.putDouble(Constants.KEY_AGE, 25.4);

        intent1.putExtras(b1);

        startActivity(intent1);
    }


    private void moveToSecondActivity_SecondWay() {
        Intent intent2 = new Intent(MainActivity.this, SecondActivity.class);

        intent2.putExtra(Constants.KEY_NAME, editText1.getText().toString());
        intent2.putExtra(Constants.KEY_AGE, 25.4);

        startActivity(intent2);


    }
}









