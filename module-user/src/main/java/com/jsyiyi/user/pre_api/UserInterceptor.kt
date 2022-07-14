package com.jsyiyi.user.pre_api

import android.app.Activity
import android.content.Context
import android.content.Intent
import com.jsyiyi.user.p2m.api.User
import com.p2m.annotation.module.api.ApiLaunchActivityInterceptor
import com.p2m.core.P2M
import com.p2m.core.launcher.ILaunchActivityInterceptor
import com.p2m.core.launcher.LaunchActivityInterceptorCallback
/**
 * 登录拦截器
 *
 * 如果未登录则会重定向到登录界面
 */
@ApiLaunchActivityInterceptor("User")
class UserInterceptor : ILaunchActivityInterceptor{

    //lateinit延迟加载
    private lateinit var context: Context;

    override fun init(context: Context) {
        this.context = context;
    }
    override fun process(callback: LaunchActivityInterceptorCallback) {
        try {
            val user = P2M.apiOf(User::class.java)
            val isLogin = user.event.userLoginState.getValue()?:false;
            if (!isLogin){
                callback.onRedirect(
                    redirectChannel = user.launcher.activityOfUser
                        .launchChannel { intent ->
                            if (context !is Activity){
                                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                            }
                            context.startActivity(intent)
                        }
                )
            }else{
                callback.onContinue()
            }
        }catch (e: Throwable){
            callback.onInterrupt(e)
        }
    }
}