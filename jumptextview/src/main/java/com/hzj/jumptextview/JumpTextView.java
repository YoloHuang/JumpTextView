package com.hzj.jumptextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rj on 2018/2/8.
 */

public class JumpTextView extends FrameLayout{


    ArrayList<String> content;
    String text;
    TextView placeHolder;
    TextView realTextView;
    boolean isBold;
    boolean isSinglen;
    int textColor;
    float textSize;
    Context context;
    TypedArray array;
    long time;
    boolean withAnimation = true;
    String finalReal;
    int count = 0;
    boolean isRun = false;

    public JumpTextView(@NonNull Context context) {
        this(context,null);
    }

    public JumpTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }

    public JumpTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        this(context, attrs);
    }
}
