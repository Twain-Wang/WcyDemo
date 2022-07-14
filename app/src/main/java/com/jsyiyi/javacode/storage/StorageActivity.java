package com.jsyiyi.javacode.storage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.jsyiyi.testkotlin.R;

public class StorageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);
    }

    public void operate(View v){
        Intent it=null;
        switch (v.getId()){
            case R.id.share_btn:
                it = new Intent(this,ShareActivity.class);
                break;
            case R.id.external_btn:
                it = new Intent(this,ExternalActivity.class);
                break;
            default:
                it = new Intent(this,InternalActivity.class);
                break;
        }
        startActivity(it);
    }
}
