package com.example.student.rocket_ride;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class activity_level3 extends AppCompatActivity {
    private static final String TAG = "Level3";

    private ImageView meteor;
    private ImageView meteor1;
    private ImageView meteor2;
    private ImageView meteor3;
    private ImageView meteor4;
    private ImageView meteor5;
    private ImageView meteor6;
    private ImageView meteor7;
    private ImageView meteor8;
    private ImageView meteor9;
    private ImageView meteor10;
    private ImageView meteor11;
    private ImageView meteor12;
    private ImageView meteor13;
    private ImageView meteor14;
    private ImageView meteor15;
    private ImageView meteor16;
    private ImageView meteor17;
    private ImageView meteor18;
    private ImageView meteor19;
    private ImageView meteor20;
    private ImageView meteor21;
    private ImageView meteor22;
    private ImageView meteor23;
    private ImageView meteor24;
    private ImageView meteor25;
    private ImageView meteor26;
    private ImageView meteor27;


    private ImageView ship;
    private ViewGroup rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);
        rootLayout = (ViewGroup) findViewById(R.id.view_root2);
        ship = (ImageView) rootLayout.findViewById(R.id.ship_3);

        meteor = (ImageView) findViewById(R.id.meteor);
        meteor1 = (ImageView) findViewById(R.id.meteor1);
        meteor2 = (ImageView) findViewById(R.id.meteor2);
        meteor3 = (ImageView) findViewById(R.id.meteor3);
        meteor4 = (ImageView) findViewById(R.id.meteor4);
        meteor5 = (ImageView) findViewById(R.id.meteor5);
        meteor6 = (ImageView) findViewById(R.id.meteor6);
        meteor7 = (ImageView) findViewById(R.id.meteor7);
        meteor8 = (ImageView) findViewById(R.id.meteor8);
        meteor9 = (ImageView) findViewById(R.id.meteor9);

        meteor10 = (ImageView) findViewById(R.id.meteor10);
        meteor11 = (ImageView) findViewById(R.id.meteor11);
        meteor12 = (ImageView) findViewById(R.id.meteor12);
        meteor13 = (ImageView) findViewById(R.id.meteor13);
        meteor14 = (ImageView) findViewById(R.id.meteor14);
        meteor15 = (ImageView) findViewById(R.id.meteor15);
        meteor16 = (ImageView) findViewById(R.id.meteor16);
        meteor17 = (ImageView) findViewById(R.id.meteor17);
        meteor18 = (ImageView) findViewById(R.id.meteor18);
        meteor19 = (ImageView) findViewById(R.id.meteor19);

        meteor20 = (ImageView) findViewById(R.id.meteor20);
        meteor21 = (ImageView) findViewById(R.id.meteor21);
        meteor22 = (ImageView) findViewById(R.id.meteor22);
        meteor23 = (ImageView) findViewById(R.id.meteor23);
        meteor24 = (ImageView) findViewById(R.id.meteor24);
        meteor25 = (ImageView) findViewById(R.id.meteor25);
        meteor26 = (ImageView) findViewById(R.id.meteor26);
        meteor27 = (ImageView) findViewById(R.id.meteor27);


        rootLayout.setOnTouchListener(new SimpleTouchListener());

        ship.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN)
                    shipMoving = true;
                else if (event.getAction() == MotionEvent.ACTION_DOWN)
                    shipMoving = false;
                return false;
            }
        });


        float bottomOfScreen = getResources().getDisplayMetrics()
                .heightPixels - (meteor.getHeight() * 4);


        meteor.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(1400)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor))
                .setDuration(5000);
        meteor1.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor1))
                .setDuration(2000);
        meteor2.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor2))
                .setDuration(5000);
        meteor3.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(1000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor3))
                .setDuration(4000);
        meteor4.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(1000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor4))
                .setDuration(3500);
        meteor5.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor5))
                .setDuration(3300);
        meteor6.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor6))
                .setDuration(2500);
        meteor7.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor7))
                .setDuration(2000);
        meteor8.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor8))
                .setDuration(6600);
        meteor9.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor9))
                .setDuration(6600);


        meteor10.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(4000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor10))
                .setDuration(6600);
        meteor11.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(4000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor11))
                .setDuration(6600);
        meteor12.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(4000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor12))
                .setDuration(1000);
        meteor13.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(4000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor13))
                .setDuration(3000);
        meteor14.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(4000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor14))
                .setDuration(4600);
        meteor15.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(4000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor15))
                .setDuration(3400);
        meteor16.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(4000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor16))
                .setDuration(2600);

        meteor17.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(1000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor17))
                .setDuration(2600);
        meteor18.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(6000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor18))
                .setDuration(1000);
        meteor19.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(6000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor19))
                .setDuration(3000);
        meteor20.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(6000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor20))
                .setDuration(2900);
        meteor21.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(6000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor20))
                .setDuration(4500);

        meteor22.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(700)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor20))
                .setDuration(1000);
        meteor23.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(9400)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor20))
                .setDuration(1000);
        meteor24.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(9400)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor20))
                .setDuration(1000);
        meteor25.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(9400)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor20))
                .setDuration(1000);
        meteor26.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(9400)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor20))
                .setDuration(1000);

        meteor27.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(9700)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor20))
                .setDuration(1500);




    }


    int moveX, moveY;
    private boolean shipMoving = false;

    private class SimpleTouchListener implements View.OnTouchListener {
        @Override
        public boolean onTouch(View screen, MotionEvent event) {
            switch (event.getAction() & MotionEvent.ACTION_MASK) {
                case MotionEvent.ACTION_UP:
                    shipMoving = false;
                    //Log.d(TAG, "onTouch: dropped it");
                    break;
                case MotionEvent.ACTION_MOVE:
                    if (!shipMoving)
                        break;
                    int newX = (int) event.getX();
                    int newY = (int) event.getY();

                    //Log.d(TAG, "onTouch: moving location by ("+(newX-moveX)+","+(newY-moveY)+")");
                    ship.setX(newX);// - moveX);
                    ship.setY(newY);// - moveY);

                    moveX = newX;
                    moveY = newY;

                    break;
            }
            rootLayout.invalidate();
            return true;
        }
    }

    private ValueAnimator.AnimatorUpdateListener createCollisionDetector(final ImageView meteor) {

        return new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Rect shipRect = new Rect(), meteorRect = new Rect();
                ship.getHitRect(shipRect);
                meteor.getHitRect(meteorRect);
                if (Rect.intersects(shipRect, meteorRect)) {
                    finish();
                }
            }
        };

    }


}
