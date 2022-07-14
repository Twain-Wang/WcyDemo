package com.jsyiyi.javacode.animation.transitionanimation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.jsyiyi.testkotlin.R;

/**
 * 转场动画
 */
public class TraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trasition);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.testReveal:
                startActivity(new Intent(this, RevealActivity.class));
                break;
            case R.id.btnScene:
                startActivity(new Intent(this, SceneActivity.class));
                break;
            case R.id.btnActivity:
                startActivity(new Intent(this, FirstActivity.class));
                break;
        }
    }

}
