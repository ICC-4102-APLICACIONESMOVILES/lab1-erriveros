package com.example.kitor.lab01

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var email: TextView
    lateinit var password: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this@MainActivity,LoginActivity::class.java)
        setContentView(R.layout.activity_main)
        password = findViewById(R.id.pass)
        email = findViewById(R.id.email1)
        val em = email.toString()
        if(em.trim().length<=0){
            startActivity(intent)
        }
        val emailS = intent.getStringExtra("email")
        val passwordS = intent.getStringExtra("password")
        email.text = emailS
        password.text = passwordS


    }
}
