package com.jsyiyi.app2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.jsyiyi.user.p2m.api.UserLaunchActivityInterceptorForUser
import com.p2m.core.P2M
import com.wcy.home.p2m.api.Home

class SplashActivity : AppCompatActivity(){
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        try {
            findViewById<View>(R.id.fullscreen_content).postDelayed({
                System.out.println("111111");
                P2M.apiOf(Home::class.java)
                    .launcher
                    .activityOfHome
                    .launchChannel {
                        it.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                        it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                        startActivity(it)
                    }
                    .addAnnotatedInterceptorBefore(UserLaunchActivityInterceptorForUser::class)
                    .navigation()
                finish()
            },2000);
        }catch (e:Throwable){
            e.printStackTrace()
        }

    }
}