package com.jsyiyi.user.pre_api

import com.p2m.annotation.module.api.ApiEvent
import com.p2m.annotation.module.api.ApiEventField
import com.p2m.annotation.module.api.EventOn

@ApiEvent
interface UserEvent {

    /**
     * 登录用户信息
     *
     * 信息发生变化时发送事件
     */
    @ApiEventField(eventOn = EventOn.MAIN,externalMutable = false)
    val userInfo: UserInfo?

    /**
     * 登录状态
     *
     * 状态发生变化时发送事件
     */
    @ApiEventField()
    val userLoginState: Boolean


    /**
     * 登录成功
     *
     * 用户主动登录成功时发送事件
     */
    @ApiEventField(eventOn = EventOn.BACKGROUND)
    val userLoginSuccess: Unit

    /**
     * externalMutable = true，表示外部模块可以setValue和postValue
     *
     * 为了保证事件的安全性不推荐设置
     */
    @ApiEventField(EventOn.MAIN,externalMutable = true)
    val testExternalMutable: Int

    val testAPT:Int     // 这个字段没有被注解，因此它将被过滤

}