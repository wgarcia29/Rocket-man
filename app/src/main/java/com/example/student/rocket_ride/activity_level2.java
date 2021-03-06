package com.example.student.rocket_ride;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
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

public class activity_level2 extends AppCompatActivity {
    private static final String TAG = "Level1";

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

    private ImageView ship;
    private ViewGroup rootLayout;
    //private int _xDelta;
    //private int _yDelta;
    /*
    private Rect rectShip = new Rect();
    private Rect rectMeteor = new Rect();

    private boolean collisionEventHandled = false;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);
        rootLayout = (ViewGroup) findViewById(R.id.view_root1);
        ship = (ImageView) rootLayout.findViewById(R.id.ship_2);

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




        //RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(350, 350);
        //ship_1.setLayoutParams(layoutParams);
        //ship_1.setOnTouchListener(new ChoiceTouchListener());
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

        //RelativeLayout main = (RelativeLayout) findViewById(R.id.view_root);
        //Button btn = (Button) findViewById(R.id.button);


        float bottomOfScreen = getResources().getDisplayMetrics()
                .heightPixels - (meteor.getHeight() * 4);

/*
        meteor.animate()
                .setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Rect shipRect = new Rect(), meteorRect = new Rect();
                        ship_1.getHitRect(shipRect);
                        meteor.getHitRect(meteorRect);
                        if (Rect.intersects(shipRect, meteorRect)) {
                            // return to menu
                            moveTaskToBack(true);
                            android.os.Process.killProcess(android.os.Process.myPid());
                            System.exit(1);
                        }
                    }
                })
                .start();
*/

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
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor3))
                .setDuration(8500);
        meteor4.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor4))
                .setDuration(3500);
        meteor5.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor5))
                .setDuration(3000);
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
                .setStartDelay(10000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor10))
                .setDuration(6600);
        meteor11.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(10000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor11))
                .setDuration(6600);
        meteor12.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(10000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor12))
                .setDuration(1600);
        meteor13.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(10000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor13))
                .setDuration(3000);
        meteor14.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(10000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor14))
                .setDuration(4600);
        meteor15.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(10000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor15))
                .setDuration(3400);
        meteor16.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(10000)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor16))
                .setDuration(2600);

        meteor17.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(7500)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor17))
                .setDuration(2600);
        meteor18.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(7500)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor18))
                .setDuration(1000);
        meteor19.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(7500)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor19))
                .setDuration(3000);
        meteor20.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(7500)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor20))
                .setDuration(2900);
        meteor21.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(7500)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor20))
                .setDuration(4500);








/*
        main.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                meteor.setX(event.getX());
                meteor.setY(event.getY());
                return true;
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rectShip.left = (int) ship_1.getX();
                rectShip.top = (int) ship_1.getY();
                rectShip.right = (int) ship_1.getX() + ship_1.getWidth();
                rectShip.bottom = (int) ship_1.getY() + ship_1.getHeight();

                rectShip.left = (int) meteor.getX();
                rectShip.top = (int) meteor.getY();
                rectShip.right = (int) meteor.getX() + meteor.getWidth();
                rectShip.bottom = (int) meteor.getY() + meteor.getHeight();

                Log.e("TEST", "handleCollision: " + handleCollision(rectShip, rectMeteor));
            }
        });
    }

    private boolean handleCollision(Rect one, Rect two) {
        boolean hasCollision = hasCollision(one, two);
        if (collisionEventHandled != hasCollision) {
            collisionEventHandled = hasCollision;
            return hasCollision;
        }
        return false;
    }

    private static boolean hasCollision(Rect one, Rect two) {
        return (one.left < two.right &&
                one.right > two.left &&
                one.top < two.bottom &&
                one.bottom > two.top);
    }

*/

/*
        Rect rc1 = new Rect();
        ship_1.getDrawingRect(rc1);
        Rect rc2 = new Rect();
        meteor.getDrawingRect(rc2);
        if (Rect.intersects(rc1, rc2)) {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
*/

    }

/*
    private final class ChoiceTouchListener implements View.OnTouchListener {
        public boolean onTouch(View view, MotionEvent event) {
            final int X = (int) event.getRawX();
            final int Y = (int) event.getRawY();
            switch (event.getAction() & MotionEvent.ACTION_MASK) {
                case MotionEvent.ACTION_DOWN:
                    RelativeLayout.LayoutParams lParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    _xDelta = X - lParams.leftMargin;
                    _yDelta = Y - lParams.topMargin;
                    break;
                case MotionEvent.ACTION_UP:
                    break;
                case MotionEvent.ACTION_POINTER_DOWN:
                    break;
                case MotionEvent.ACTION_POINTER_UP:
                    break;
                case MotionEvent.ACTION_MOVE:
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view
                            .getLayoutParams();
                    layoutParams.leftMargin = X - _xDelta;
                    layoutParams.topMargin = Y - _yDelta;
                    layoutParams.rightMargin = -250;
                    layoutParams.bottomMargin = -250;
                    view.setLayoutParams(layoutParams);
                    break;
            }
            rootLayout.invalidate();
            return true;
        }

    }
*/

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
                    //Log.d(TAG, "onAnimationUpdate: collision detected!");
                    //Log.d(TAG, "shipRect: (" + shipRect.centerX()+","+shipRect.centerY()+")");
                    //Log.d(TAG, "shipRect: (" + meteorRect.centerX()+","+meteorRect.centerY()+")");
                    // return to menu
//                        moveTaskToBack(true);
//                        android.os.Process.killProcess(android.os.Process.myPid());
//                        System.exit(1);
                    finish();
                }
            }
        };

    }

}
