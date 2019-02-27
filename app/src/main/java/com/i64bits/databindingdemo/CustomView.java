package com.i64bits.databindingdemo;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import com.i64bits.databindingdemo.databinding.CustomViewBinding;

public class CustomView extends LinearLayout implements View.OnTouchListener
{
    // This change is done from GitHub.
    private static final String TAG = "CustomView";

    CustomViewBinding binding;
    User user;
    FirstBranch firstBranch;

    public CustomView(Context context)
    {
        super(context);
        init();
        setValue();
        setListener();
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
        setValue();
        setListener();
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
        setValue();
        setListener();
    }

    public void init()
    {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        binding = CustomViewBinding.inflate(inflater, this, true);
    }

    public void setValue()
    {
        binding.txtLeft.setText("LeFt");
        binding.txtRight.setText("RiGhT");
    }

    public void setListener()
    {
        binding.txtLeft.setOnTouchListener(this);
        binding.txtRight.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_DOWN)
        {
            view.setBackgroundColor(Color.RED);
        }

        if(event.getAction() == MotionEvent.ACTION_UP)
        {
            view.setBackgroundColor(Color.WHITE);
        }

        return true;
    }
}
