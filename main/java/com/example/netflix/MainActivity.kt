package com.example.netflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        changeLogin()

    }

     fun changeLogin(){
        val intent = Intent(this, FormLogin::class.java)

         GlobalScope.launch {
            delay(3000)
             startActivity(intent)
             finish()

         }
    }
}