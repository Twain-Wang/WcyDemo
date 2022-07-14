package com.wcy.home.pre_api

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.p2m.annotation.module.api.ApiLauncher
import com.wcy.home.R

@ApiLauncher("Home")
class HomeActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}