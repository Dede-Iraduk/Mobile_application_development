package com.example.somasana

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth


class Login : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        var email = findViewById<EditText>(R.id.email)
        var password = findViewById<EditText>(R.id.password)
        var loginBtn = findViewById<Button>(R.id.loginBtn)
        var createtext = findViewById<TextView>(R.id.createtext)
        var createtext2 = findViewById<TextView>(R.id.createtext2)



        loginBtn.setOnClickListener {
            val email = email.text
            val password = password.text
            Toast.makeText(this@Login, "successful login", Toast .LENGTH_SHORT).show()
        }


        }

    }




