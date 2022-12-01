package com.example.somasana

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth


class Register : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var fullname = findViewById<EditText>(R.id.fullname)
        var email = findViewById<EditText>(R.id.email)
        var password = findViewById<EditText>(R.id.password)
        var registerBtn = findViewById<Button>(R.id.loginBtn)
        var createtext = findViewById<TextView>(R.id.createtext)



        registerBtn.setOnClickListener {
            val fullname = fullname.text
            val email = email.text
            val password = password.text
            Toast.makeText(this@Register, "successful sign up", Toast .LENGTH_SHORT).show()

        }





    }
}