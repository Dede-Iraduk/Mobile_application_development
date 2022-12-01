package com.example.somasana1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MathSubmission : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math_submission)

        val submissionStatusOpener = findViewById<Button>(R.id.button5)
        submissionStatusOpener.setOnClickListener{
            val Intent = Intent(this,SubmissionStatus::class.java)
            startActivity(Intent)
        }
    }
}