package com.example.ohmstede_hw2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements SurfaceHolder.Callback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        FireView fireID = findViewById(R.id.fireview);
        FireController ctrID = new FireController(fireID);

        //changing value display for red seekbar
        SeekBar seekbarRed = findViewById(R.id.redSB);
        seekbarRed.setOnSeekBarChangeListener(ctrID);

        //changing value display for green seekbar
        SeekBar seekbarGreen = findViewById(R.id.greenSB);
        seekbarGreen.setOnSeekBarChangeListener(ctrID);

        //changing value display for blue seekbar
        SeekBar seekbarBlue = findViewById(R.id.blueSB);
        seekbarBlue.setOnSeekBarChangeListener(ctrID);
    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {

    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {

    }
}