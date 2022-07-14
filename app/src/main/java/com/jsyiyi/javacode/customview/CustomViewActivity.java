package com.jsyiyi.javacode.customview;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.jsyiyi.testkotlin.R;

public class CustomViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customview);
        final View view = findViewById(R.id.id_pb);
        view.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ObjectAnimator.ofInt(view, "progress", 0, 100).setDuration(3000).start();
            }
        });
    }
}
