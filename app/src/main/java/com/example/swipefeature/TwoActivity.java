package com.example.swipefeature;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

public class TwoActivity extends MainActivity {
    float x1, x2, y1, y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
    public boolean onTouchEvent(MotionEvent touchEvent) {
        switch (touchEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if (x1 < x2) {
                    Intent i = new Intent(TwoActivity.this, MainActivity.class);
                    startActivity(i);
                    finish();
                } else if (x1 > x2) {
                }
                break;
        }
        return false;
    }
}
