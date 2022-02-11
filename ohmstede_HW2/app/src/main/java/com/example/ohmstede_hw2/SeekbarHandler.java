package com.example.ohmstede_hw2;

import android.graphics.Color;
import android.graphics.Paint;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * AUTHOR: Chase Ohmstede
 *
 * DATA: 2/9/2022
 *
 * DESC: Seekbar Listener. Adjusts the RGB values of the selected object based on the
 * value of each individual seekbar.
 */


public class SeekbarHandler implements SeekBar.OnSeekBarChangeListener {

    private FireView view;
    private CustomElement model;

    public TextView redView, greenView, blueView;

    public SeekbarHandler(TextView initTV) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //not needed
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //not needed
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        int sb_ID = seekBar.getId();

        /** checks to see which seekbar is being changed, and tries to adjust the rgb values accordingly **/

        if (fromUser) {
            switch (sb_ID) {
                case (R.id.redSB):
                    //this.model.setRed(progress);
                    //view.invalidate();
                    break;
                case (R.id.greenSB):
                    //this.model.setGreen(progress);
                    //view.invalidate();
                    break;
                case (R.id.blueSB):
                    //this.model.setBlue(progress);
                    //view.invalidate();
                    break;
            }
        }

        /** changes the text to the progress of the seekbar **/

        this.redView.setText("" + progress);
        this.greenView.setText("" + progress);
        this.blueView.setText("" + progress);

    }
}
