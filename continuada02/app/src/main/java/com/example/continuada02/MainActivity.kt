package com.example.continuada02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun comprar(view: View) {

        val etCachorro1: Double = findViewById(R.id.et_cachorro1)
        val etCachorro2: Double = findViewById(R.id.et_cachorro2)

        if (etCachorro1.)
        val tela2 = Intent(this, Tela2::class.java)
        startActivity(tela2)
    }


}