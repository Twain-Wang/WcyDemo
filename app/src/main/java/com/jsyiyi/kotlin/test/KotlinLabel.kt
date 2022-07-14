package com.jsyiyi.kotlin.test

class KotlinLabel {
    fun returnDemo1(){
        println("START : "+::returnDemo1.name)
        val intArray = intArrayOf(1,2,3,4,5,6,7,8)
        intArray.forEach {
            if (it == 3)
                return
            print(it)
        }
        println("END : "+::returnDemo1.name)
    }
}