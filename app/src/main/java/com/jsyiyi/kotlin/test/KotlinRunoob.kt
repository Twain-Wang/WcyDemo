package com.jsyiyi.kotlin.test

class KotlinRunoob constructor(name: String){
    var url: String = "http://www.runoob.com"
    var country: String = "CN"
    var siteName = name
    init {
        println("name=====${name}")
    }
    constructor(name: String,alexa: Int): this(name){
        println("alexa======${alexa}")
    }
    fun printTest(){
        println("END======")
    }
}