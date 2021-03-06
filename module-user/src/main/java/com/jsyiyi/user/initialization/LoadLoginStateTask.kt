package com.jsyiyi.user.initialization

import android.content.Context
import com.jsyiyi.user.UserDiskCache
import com.p2m.core.module.task.Task
import com.p2m.core.module.task.TaskOutputProvider
// 读取登录状态的任务，input:UserDiskCache output:Boolean
class LoadLoginStateTask: Task<UserDiskCache, Boolean>() {

    // 处于执行阶段，运行在单独子线程
    override fun onExecute(context: Context, input: UserDiskCache, taskOutputProvider: TaskOutputProvider): Boolean {
        // 输出查询到的登录状态
        return input.readLoginState()
    }
} 