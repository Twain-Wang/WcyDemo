package com.jsyiyi.kotlin.test

class KotlinInner {
    private val bar: Int = 1
    var v = "成员属性"
    inner class InnerClass{
        fun innerBar() = bar
        fun innerTest(){
            var outer = this@KotlinInner
            println("内部类可以引用外部类的成员，例如："+outer.v)
        }
    }
}