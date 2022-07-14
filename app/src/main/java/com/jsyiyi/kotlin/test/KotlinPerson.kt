package com.jsyiyi.kotlin.test

class KotlinPerson {

    var firstName: String = "123"

    lateinit var name: String

    var lastName: String = "wang"
        get() = field.uppercase()
        set

    var no: Int = 1
        get() = field
        set(value) {
            if (value < 10){
                field = value
            }else{
                field = -1
            }
        }
    var height: Float = 145.5f
        private set

}