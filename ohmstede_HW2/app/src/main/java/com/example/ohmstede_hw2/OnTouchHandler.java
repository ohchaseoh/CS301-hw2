package com.example.ohmstede_hw2;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * AUTHOR: Chase Ohmstede
 *
 * DATA: 2/9/2022
 *
 * DESC: The OnTouch Listener, and supposed to select whichever element was touched. Super bugged
 * out though :/// .
 */

public class OnTouchHandler implements View.OnTouchListener {

    private CustomElement selected;
    private FireView view;
    private Canvas canvas;

    SeekBar sbRed, sbGreen, sbBlue;
    TextView selected_tv;

    public OnTouchHandler(SeekBar sbRed, SeekBar sbGreen, SeekBar sbBlue, TextView selected_tv) {
        this.sbRed = sbRed;
        this.sbGreen = sbGreen;
        this.sbBlue = sbBlue;
        this.selected_tv = selected_tv;
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int x = (int)motionEvent.getX();
        int y = (int)motionEvent.getY();

        /* this doesn't work, please ignore */

        if(selected.containsPoint(x, y)) {

            this.selected.drawHighlight(canvas);
            selected_tv.setText(this.selected.myName);

        }

        view.invalidate();
        return false;
    }

    /* methods for setting red, green, and blue for SeekbarHandler to use */

    public void setRed(int red) {
        if (this.selected != null) {
            this.selected.setRed(red);
        }
    }

    public void setGreen(int green) {
        if (this.selected != null) {
            this.selected.setGreen(green);
        }
    }

    public void setBlue(int blue) {
        if (this.selected != null) {
            this.selected.setBlue(blue);
        }
    }
}
