package com.example.ohmstede_hw2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class FireView extends SurfaceView {

    public int ballRadius = 185;

    /* declaring paints to be used */
    Paint carrotPaint   = new Paint();
    Paint coalPaint     = new Paint();
    Paint hatPaint      = new Paint();
    Paint hatTrimPaint  = new Paint();
    Paint scarfPaint    = new Paint();
    Paint snowPaint     = new Paint();

    /* object for FireView*/
    public CustomCircle ball1;
    public CustomCircle ball2;
    public CustomCircle ball3;
    public CustomCircle coal1;
    public CustomCircle coal2;

    public CustomRect hat1;
    public CustomRect hat2;
    public CustomRect hatTrim;
    public CustomRect scarf1;
    public CustomRect scarf2;
    public CustomRect carrot;

    public FireView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);

        /* set up paints */
        carrotPaint.setColor(0xFFFCA103);
        coalPaint.setColor(0xFF1A140B);
        hatPaint.setColor(0xFF3B2F1A);
        hatTrimPaint.setColor(0xFF24221E);
        scarfPaint.setColor(0xFF8F2727);
        snowPaint.setColor(Color.WHITE);

        setBackgroundColor(0xFFC0DB9C);
    }

    @SuppressLint("DrawAllocation")
    public void onDraw(Canvas canvas) {

        /* drawing objects */
        ball1   = new CustomCircle  ("ball1",   snowPaint.getColor(),       400, 800, ballRadius);
        ball2   = new CustomCircle  ("ball2",   snowPaint.getColor(),       400, 600, ballRadius - 40);
        ball3   = new CustomCircle  ("ball3",   snowPaint.getColor(),       400, 400, ballRadius - 70);

        hat1    = new CustomRect    ("hat1",    hatPaint.getColor(),        300, 280, 520, 320);
        hat2    = new CustomRect    ("hat2",    hatPaint.getColor(),        360, 180, 460, 320);
        hatTrim = new CustomRect    ("hatTrim", hatTrimPaint.getColor(),    360, 250, 460, 280);

        scarf1  = new CustomRect    ("scarf1",  scarfPaint.getColor(),      280, 440, 520, 520);
        scarf2  = new CustomRect    ("scarf2",  scarfPaint.getColor(),      260, 460, 320, 660);

        coal1   = new CustomCircle  ("coal1",   coalPaint.getColor(),       355,355, 10 );
        coal2   = new CustomCircle  ("coal2",   coalPaint.getColor(),       445,370, 10 );

        carrot  = new CustomRect    ("carrot",  carrotPaint.getColor(),     400, 390, 430, 400);

        ball1.drawMe(canvas);
        ball2.drawMe(canvas);
        ball3.drawMe(canvas);
        hat1.drawMe(canvas);
        hat2.drawMe(canvas);
        hatTrim.drawMe(canvas);
        coal1.drawMe(canvas);
        coal2.drawMe(canvas);
        scarf2.drawMe(canvas);
        scarf1.drawMe(canvas);
        carrot.drawMe(canvas);

    }

}
