package com.example.ohmstede_hw2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * AUTHOR: Chase Ohmstede
 *
 * DATA: 2/9/2022
 *
 * DESC: In hindsight, it might've been easier to use Bitmap images as my assets. That way selecting
 * and changing RGB values might be a lot easier. I now know this for the future.
 *
 */

public class MainActivity extends AppCompatActivity {

    /** ~~ READ ME BEFORE PROCEEDING TO OTHER FILES ~~
     *
     * Originally, I was going to draw a firetruck as my picture since they're
     * pretty cool. Unfortunately, my "research" has taught me that drawing
     * a firetruck, even a cartoon one, requires a lot more detail than I
     * originally anticipated. So instead of wasting time trying to make the
     * perfect fire engine, I chose to draw a snowman instead.
     *
     * This is why there are classes named FireView and FireController.
     * I didn't want to rename all of my classes, seeing how far I was into the
     * programming. Yes I understand the irony.
     *
     **/

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);

        FireView fireview = findViewById(R.id.fireview);

        //changing value display for rgb seekbars
        SeekBar sbRed   = (SeekBar) findViewById(R.id.redSB);
        SeekBar sbGreen = (SeekBar) findViewById(R.id.greenSB);
        SeekBar sbBlue  = (SeekBar) findViewById(R.id.blueSB);

        TextView redView    = findViewById(R.id.redView);
        TextView greenView  = findViewById(R.id.greenView);
        TextView blueView   = findViewById(R.id.blueView);

        //TextView
        TextView selected_TV = findViewById(R.id.selectedVal);

        SeekBar.OnSeekBarChangeListener sbRedListener   = new SeekbarHandler(redView);
        SeekBar.OnSeekBarChangeListener sbGreenListener = new SeekbarHandler(greenView);
        SeekBar.OnSeekBarChangeListener sbBlueListener  = new SeekbarHandler(blueView);

        sbRed.setOnSeekBarChangeListener(sbRedListener);
        sbGreen.setOnSeekBarChangeListener(sbGreenListener);
        sbBlue.setOnSeekBarChangeListener(sbBlueListener);

        sbRed.setMax(255);
        sbGreen.setMax(255);
        sbBlue.setMax(255);

    }
}