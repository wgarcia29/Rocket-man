package com.example.student.rocket_ride;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Level1_Activity extends AppCompatActivity {
    private static final String TAG = "Level1";

    private ImageView meteor0;
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


    private ImageView ship;
    private ViewGroup rootLayout;

    /*
    private Rect rectShip = new Rect();
    private Rect rectMeteor = new Rect();

    private boolean collisionEventHandled = false;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_2);
        rootLayout = (ViewGroup) findViewById(R.id.view_root);
        ship = (ImageView) rootLayout.findViewById(R.id.ship_1);

        meteor0 = (ImageView) findViewById(R.id.meteor);
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


//        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(350, 350);
//        ship.setLayoutParams(layoutParams);
        rootLayout.setOnTouchListener(new SimpleTouchListener());
//        ship.setOnTouchListener(new ChoiceTouchListener());
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
                .heightPixels - (meteor0.getHeight() * 4);


        meteor0.animate()
                .translationY(bottomOfScreen)
                .setStartDelay(1400)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor0))
                .setDuration(7000);
        meteor1.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor1))
                .setDuration(4000);
        meteor2.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor2))
                .setDuration(3000);
        meteor3.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor3))
                .setDuration(5500);
        meteor4.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor4))
                .setDuration(3500);
        meteor5.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor5))
                .setDuration(4000);
        meteor6.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor6))
                .setDuration(2300);
        meteor7.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor7))
                .setDuration(6000);
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
                .setInterpolator(new AccelerateInterpolator())
                .setUpdateListener(createCollisionDetector(meteor9))
                .setDuration(6900);


    }

    int moveX, moveY;
    private boolean shipMoving = false;

    private class SimpleTouchListener implements View.OnTouchListener {
        @Override
        public boolean onTouch(View screen, MotionEvent event) {
            switch (event.getAction() & MotionEvent.ACTION_MASK) {
//                case MotionEvent.ACTION_DOWN:
//                    // TODO check if ship touched
//                    Rect shipRect = new Rect();
//                    ship.getHitRect(shipRect);
//                    if (shipRect.contains(moveX, moveY)) {
//                        shipMoving = true;
//                        Log.d(TAG, "onTouch: picked up");
//                    }
//                    moveX = (int) event.getX();
//                    moveY = (int) event.getY();
////                    ship.setX(moveX);
////                    ship.setY(moveY);
//                    break;
                case MotionEvent.ACTION_UP:
                    shipMoving = false;
                    Log.d(TAG, "onTouch: dropped it");
                    break;
                case MotionEvent.ACTION_MOVE:
                    if (!shipMoving)
                        break;
                    int newX = (int) event.getX();
                    int newY = (int) event.getY();

                    Log.d(TAG, "onTouch: moving location by (" + (newX - moveX) + "," + (newY - moveY) + ")");
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
                    Log.d(TAG, "onAnimationUpdate: collision detected!");
                    Log.d(TAG, "shipRect: (" + shipRect.centerX() + "," + shipRect.centerY() + ")");
                    Log.d(TAG, "shipRect: (" + meteorRect.centerX() + "," + meteorRect.centerY() + ")");
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




