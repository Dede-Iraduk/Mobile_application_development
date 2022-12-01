package com.example.somasana1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val studentLoginOpener = findViewById<Button>(R.id.button2)
        studentLoginOpener.setOnClickListener{
            val Intent = Intent(this,StudentLogin::class.java)
            startActivity(Intent)
        }
        val studentRegisterOpener = findViewById<Button>(R.id.button)
        studentRegisterOpener.setOnClickListener{
            val Intent2 = Intent(this,StudentRegister::class.java)
            startActivity(Intent2)
        }
    }
}