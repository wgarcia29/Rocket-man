package com.example.student.rocket_ride;

import android.content.ClipData;
import android.content.ClipDescription;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Level1_Activity extends AppCompatActivity {

    private ImageView meteor;
    private ImageView ship_1;
    private ViewGroup rootLayout;
    private int _xDelta;
    private int _yDelta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_2);
        rootLayout = (ViewGroup) findViewById(R.id.view_root);
        ship_1 = (ImageView) rootLayout.findViewById(R.id.ship_1);

        meteor = (ImageView) findViewById(R.id.meteor);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(350, 350);
        ship_1.setLayoutParams(layoutParams);
        ship_1.setOnTouchListener(new ChoiceTouchListener());

        float bottomOfScreen = getResources().getDisplayMetrics()
                .heightPixels - (meteor.getHeight() * 4);

        meteor.animate()
                .translationY(bottomOfScreen)
                .setInterpolator(new AccelerateInterpolator())
                .setInterpolator(new BounceInterpolator())
                .setDuration(6000);

        Rect rc1 = new Rect();
        ship_1.getDrawingRect(rc1);
        Rect rc2 = new Rect();
        meteor.getDrawingRect(rc2);
        if (Rect.intersects(rc1, rc2) ){
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }

    }


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


}