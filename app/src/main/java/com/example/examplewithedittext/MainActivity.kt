package com.example.examplewithedittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener {
            (supportFragmentManager.findFragmentByTag("hello") as Fragment?)?.sayHello()
        }
if(savedInstanceState == null){
    val   fragment = Fragment()
    supportFragmentManager.beginTransaction().add(R.id.frame, fragment,"hello").commit()
}else{
  supportFragmentManager.findFragmentByTag("hello") as Fragment?
}


    }
}