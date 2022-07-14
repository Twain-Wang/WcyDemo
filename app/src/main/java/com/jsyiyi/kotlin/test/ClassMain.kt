package com.jsyiyi.kotlin.test

class ClassMain {
    val param = "1234567890"
    var param2 = "";
    fun TestDemo(name: String):String{
        param2 = param + name
        return param2
    }
}