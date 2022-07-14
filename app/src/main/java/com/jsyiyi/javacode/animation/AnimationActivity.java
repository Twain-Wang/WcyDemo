package com.jsyiyi.javacode.animation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.jsyiyi.javacode.animation.FrameAnimationActivity;
import com.jsyiyi.javacode.animation.PropertyActivity;
import com.jsyiyi.javacode.animation.ViewAnimationActivity;
import com.jsyiyi.testkotlin.R;

public class AnimationActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        findViewById(R.id.testPro).setOnClickListener(this);
        findViewById(R.id.testView).setOnClickListener(this);
        findViewById(R.id.testFrame).setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.testPro:
                Intent proIntent = new Intent(this, PropertyActivity.class);
                startActivity(proIntent);
                break;
            case R.id.testView:
                Intent viewIntent = new Intent(this, ViewAnimationActivity.class);
                startActivity(viewIntent);
                break;
            case R.id.testFrame:
                Intent frameIntent = new Intent(this, FrameAnimationActivity.class);
                startActivity(frameIntent);
                break;
            default:
                break;
        }
    }
}
