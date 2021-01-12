package com.example.netflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_form_login.*

class FormLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_login)

        val cadastrar = txt_increver

        cadastrar.setOnClickListener {
            AbrirCadastro()
        }


    }


    private fun AbrirCadastro(){
        val intent = Intent(this, Cadastro::class.java)
        startActivity(intent)
    }
}