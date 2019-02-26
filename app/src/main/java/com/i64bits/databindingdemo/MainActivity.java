package com.i64bits.databindingdemo;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.i64bits.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        init();

        binding.firstCustomView.setBackgroundColor(Color.GRAY);
    }

    public void init()
    {
        binding.btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.txtHelloPersonName.setText("Hello " + binding.edtPersonName.getText().toString()+".");
            }
        });
    }
}
