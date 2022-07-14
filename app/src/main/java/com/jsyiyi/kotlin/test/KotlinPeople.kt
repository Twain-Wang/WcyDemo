package com.jsyiyi.kotlin.test

class KotlinPeople constructor(fName: String){
    var firstName: String = fName
    lateinit var secondName: String
    init {
        println("fName======${fName}")
    }
}