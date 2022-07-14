package com.jsyiyi.javacode.touchevent;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;


public class BaseContentActivity extends AppCompatActivity
{
    public static final String TITLE = "title";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String title = intent.getStringExtra(TITLE);
        if (!TextUtils.isEmpty(title))
            setTitle(title);
    }



}
