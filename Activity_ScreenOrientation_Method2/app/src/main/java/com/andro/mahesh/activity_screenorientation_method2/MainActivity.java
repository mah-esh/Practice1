package com.andro.mahesh.activity_screenorientation_method2;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView textViewName;
    private EditText editTextName;
    private Button buttonName;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate");

        textViewName = (TextView) findViewById(R.id.textView1);
        editTextName = (EditText) findViewById(R.id.editText1);
        buttonName = (Button) findViewById(R.id.button1);
        imageView = (ImageView) findViewById(R.id.imageView1);

        buttonName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewName.setText("Welcome " +editTextName.getText().toString());
                buttonName.setText("LOGOUT");
            }
        });
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.i(TAG, "onConfigurationChanged()");

        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(getApplicationContext(), "Portrait", Toast.LENGTH_SHORT).show();
            imageView.setImageResource(R.drawable.portrait);
        }else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            Toast.makeText(getApplicationContext(), "LandScape", Toast.LENGTH_SHORT).show();
            imageView.setImageResource(R.drawable.landscape);
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy()");
    }

}
