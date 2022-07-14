package com.wcy.home.initialization

import android.content.Context
import com.p2m.annotation.module.ModuleInitializer
import com.p2m.core.P2M
import com.p2m.core.module.ModuleInit
import com.p2m.core.module.task.TaskOutputProvider
import com.p2m.core.module.task.TaskRegister
import com.wcy.home.p2m.api.Home

@ModuleInitializer
class HomeModuleInit : ModuleInit{
    override fun onCompleted(context: Context, taskOutputProvider: TaskOutputProvider) {
        val home = P2M.apiOf(Home::class.java)
    }

    override fun onEvaluate(context: Context, taskRegister: TaskRegister) {

    }
}