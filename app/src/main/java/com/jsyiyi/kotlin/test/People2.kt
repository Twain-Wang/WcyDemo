package com.jsyiyi.kotlin.test

import android.content.Context
import android.util.AttributeSet

open class People2(name: String) {
    constructor(name: String,age: Int): this(name){
        println("------基类----${age}")
        println("-------基类次级构造函数---------")
    }
}