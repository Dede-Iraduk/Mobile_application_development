package com.example.somasana1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StudentRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_register)

        val studentLoginOpener = findViewById<Button>(R.id.button4)
        studentLoginOpener.setOnClickListener{
            val Intent = Intent(this,StudentLogin::class.java)
            startActivity(Intent)
        }

        val studentLoginOpener2 = findViewById<Button>(R.id.button3)
        studentLoginOpener2.setOnClickListener{
            val Intent2 = Intent(this,StudentLogin::class.java)
            startActivity(Intent2)
        }
    }
}