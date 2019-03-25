package com.example.kitor.lab01

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        var email = findViewById(R.id.email) as EditText
        var password = findViewById(R.id.password) as EditText


        btnLogin.setOnClickListener{
            val intent = Intent(this@LoginActivity,MainActivity::class.java);
            val passwordS: String = password.toString()
            val emailS: String = email.toString()
            if(passwordS.trim().length<0 || android.util.Patterns.EMAIL_ADDRESS.matcher(email.toString()).matches()) {
                Toast.makeText(applicationContext, "Ingrese correctamente los datos", Toast.LENGTH_SHORT).show()
            }
            else{
                intent.putExtra("email", emailS)
                intent.putExtra("password", passwordS)
                startActivity(intent)
            }
        }
    }

}
