package com.booboomx.dixinlead;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ViewFlipper;

public class DiXinActivity extends FragmentActivity {

    private GestureDetector detector;

    private ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_di_xin);

        flipper = (ViewFlipper) findViewById(R.id.vf);

        detector = new GestureDetector(this, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                if (e1.getX() - e2.getX() > 120.0F) {//
                    flipper.setInAnimation(DiXinActivity.this, R.anim.tip_left_in);
                    flipper.setOutAnimation(DiXinActivity.this, R.anim.tip_left_out);
                    if (flipper.getDisplayedChild() < 2) {
                        flipper.showNext();
                    }
                } else if (e1.getX() - e2.getX() < -120.0F) {
                    flipper.setInAnimation(DiXinActivity.this, R.anim.tip_right_in);
                    flipper.setOutAnimation(DiXinActivity.this, R.anim.tip_right_out);
                    if (flipper.getDisplayedChild() > 0) {
                        flipper.showPrevious();
                    }
                }
                return false;
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (detector != null) {
            return detector.onTouchEvent(event);
        }
        return super.onTouchEvent(event);
    }
}
