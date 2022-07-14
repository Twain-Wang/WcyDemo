package com.jsyiyi.user.initialization

import android.content.Context
import com.jsyiyi.user.UserDiskCache
import com.jsyiyi.user.p2m.api.User
import com.p2m.annotation.module.ModuleInitializer
import com.p2m.core.P2M
import com.p2m.core.module.ModuleInit
import com.p2m.core.module.task.TaskOutputProvider
import com.p2m.core.module.task.TaskRegister

@ModuleInitializer
class UserModuleInit : ModuleInit{
    override fun onEvaluate(context: Context, taskRegister: TaskRegister) {
        // 用户本地缓存
        val userDiskCache = UserDiskCache(context)
        // 注册读取登录状态的任务
        taskRegister.register(LoadLoginStateTask::class.java, input = userDiskCache)
    }
    override fun onCompleted(context: Context, taskOutputProvider: TaskOutputProvider) {
        val user = P2M.apiOf(User::class.java)
    }
}