package com.example.firstappandersen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textHelloWorld = findViewById<View>(R.id.textView)
        val buttonHelloAndersen = findViewById<View>(R.id.hello_button)

        buttonHelloAndersen.setOnClickListener {
            textHelloWorld.isVisible = true
        }




    }
}