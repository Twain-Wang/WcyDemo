package com.jsyiyi.kotlin.test

class StaticMain {
    companion object{
        val param = "123456"
        var param2 = ""
        fun TestDemo(name: String): String{
            param2 = param + name
            return param2
        }
    }


}