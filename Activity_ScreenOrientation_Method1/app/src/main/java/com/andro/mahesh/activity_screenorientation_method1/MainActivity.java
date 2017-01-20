package com.andro.mahesh.activity_screenorientation_method1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = MainActivity.class.getSimpleName();

    private EditText editTextName;
    private Button btnName;
    private TextView textViewName;

    private final String KEY_MESSAGE = "message";
    private final String KEY_BTN_TEXT = "button_text";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate");

        editTextName = (EditText) findViewById(R.id.editText1);
        btnName = (Button) findViewById(R.id.button1);
        textViewName = (TextView) findViewById(R.id.textView1);

        btnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewName.setText(editTextName.getText().toString());
                btnName.setText("LOGOUT");
            }
        });
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        textViewName.setText(savedInstanceState.getString(KEY_MESSAGE));
        btnName.setText(savedInstanceState.getString(KEY_BTN_TEXT));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString(KEY_MESSAGE, textViewName.getText().toString());
        outState.putString(KEY_BTN_TEXT, btnName.getText().toString());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }
}
