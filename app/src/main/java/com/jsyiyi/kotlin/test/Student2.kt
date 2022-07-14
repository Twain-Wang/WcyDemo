package com.jsyiyi.kotlin.test

class Student2 : People2 {
    constructor(name:String,age:Int,no:String,score:Int):super(name, age){
        println("-------继承类次级构造函数---------")
        println("学生名： ${name}")
        println("年龄： ${age}")
        println("学生号： ${no}")
        println("成绩： ${score}")
    }
}