package com.jsyiyi.kotlin.test

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jsyiyi.testkotlin.R
import com.jsyiyi.testkotlin.SecondActivity
import kotlinx.android.synthetic.main.kotlin_second.*

class KotlinScenod : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_second)
        secondTest.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}