package com.example.swipefeature;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {
    float x1, x2, y1, y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public boolean onTouchEvent(MotionEvent touchEvent){
        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if(x1 < x2){
//                    Toast.makeText(this, "Left swipe", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this, OneActivity.class);
                    startActivity(i);
                    finish();
                }else if(x1 > x2){
//                    Toast.makeText(this, "right swipe", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(MainActivity.this,TwoActivity.class));
                }
                break;
        }
        return false;
    }
}