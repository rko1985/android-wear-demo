package com.example.zappycode.androidweardemo;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends WearableActivity {

    private TextView mTextView;

    public void determineRoundOrSquare(View view){
        if(getResources().getConfiguration().isScreenRound()){
            Toast.makeText(this, "ROUND!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "SQUARE!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text);

        if(getResources().getConfiguration().isScreenRound()){
            Log.i("Device", "Round!");
        } else {
            Log.i("Device", "Square!");
        }

        // Enables Always-on
        setAmbientEnabled();
    }
}
