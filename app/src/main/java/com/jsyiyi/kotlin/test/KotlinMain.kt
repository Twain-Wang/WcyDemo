package com.jsyiyi.kotlin.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jsyiyi.testkotlin.R
import kotlinx.android.synthetic.main.kotlin_main.*

class KotlinMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_main)
        testBtn.setOnClickListener {
//            val intent = Intent(this,KotlinScenod::class.java);
//            startActivity(intent)
//            this.TestLabel()
//            this.testPerson()
//            this.testPeople()
//            this.testRunoob()
//            this.testNested()
//            this.testInner()
//            this.testInterface()
//            this.testCons()
            this.testCons2()
        }
    }

    fun testCons2(){
        var s =  Student2("Runoob", 18, "S12345", 89)
    }

    fun testCons(){
        val s = Student("Runoob", 18, "S12346", 89)
        println("学生名： ${s.name}")
        println("年龄： ${s.age}")
        println("学生号： ${s.no}")
        println("成绩： ${s.score}")
    }

    fun testInterface(){
        var testInterface = TestInterface()
        testInterface.interfaceAction(object : KotlinInterface {
            override fun test(name: String) {
                println(name)
            }

        })
    }

    fun testInner(){
        var innerBar = KotlinInner().InnerClass().innerBar()
        println("innerBar ====== ${innerBar}")

        KotlinInner().InnerClass().innerTest()
    }

    fun testNested(){
        val nestedClass = KotlinNested.NestedClass();
        nestedClass.nestedAction()
    }

    fun testRunoob(){
        val runoob: KotlinRunoob = KotlinRunoob("123456",10000)
        println(runoob.siteName)
        println(runoob.country)
        println(runoob.url)
        runoob.printTest()
    }

    fun testPeople(){
        val people: KotlinPeople = KotlinPeople("1234")
        println("firstName=====${people.firstName}")
    }

    fun testPerson(){
        var person: KotlinPerson = KotlinPerson()
        person.lastName = "zhang"
        println("lastName====:${person.lastName}")

        person.no = 9
        println("no=====:${person.no}")

        person.no = 20
        println("no====:${person.no}")

        println("height====:${person.height}")

        person.firstName = "456"
        println("firstName======:${person.firstName}")

        person.name = "9999"
        println("name=====:${person.name}")

    }

    fun TestLabel(){
        var kotlinLabel = KotlinLabel()
        kotlinLabel.returnDemo1()
    }
}