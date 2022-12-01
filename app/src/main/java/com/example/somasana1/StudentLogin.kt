package com.example.somasana1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StudentLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_login)

        val submissionOpener = findViewById<Button>(R.id.button3)
        submissionOpener.setOnClickListener{
            val Intent = Intent(this,Notes::class.java)
            startActivity(Intent)
        }
    }
}