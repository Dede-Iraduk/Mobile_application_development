package com.example.somasana1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Notes : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)

        val notesOpener = findViewById<Button>(R.id.button_send)
        notesOpener.setOnClickListener{
            val Intent = Intent(this,StudentLogin::class.java)
            startActivity(Intent)
        }


    }
}