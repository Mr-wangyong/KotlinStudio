package com.mrwang.kotlinstudio

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.text="Hello kotlin"
        tv.textSize=20.0f
        tv.setTextColor(Color.BLACK)
    }
}
