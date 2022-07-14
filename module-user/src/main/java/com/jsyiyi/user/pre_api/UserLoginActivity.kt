package com.jsyiyi.user.pre_api

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jsyiyi.user.R
import com.p2m.annotation.module.api.ApiLauncher

@ApiLauncher("User")
class UserLoginActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_login)
    }
}