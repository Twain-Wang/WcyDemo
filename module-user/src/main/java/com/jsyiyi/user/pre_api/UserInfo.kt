package com.jsyiyi.user.pre_api

import com.p2m.annotation.module.api.ApiUse

@ApiUse
class UserInfo {
    var userId: String? = null;
    var userName: String? = null;
    var phone: String? = null;
}