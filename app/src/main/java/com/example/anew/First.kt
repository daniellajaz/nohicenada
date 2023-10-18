package com.example.anew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.widget.AppCompatEditText

class First : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val btnSaludar = findViewById<Button>(R.id.btnSaludar)
        val etName = findViewById<AppCompatEditText>(R.id.etName)

        btnSaludar.setOnClickListener {
            val name = etName.text.toString()
            if (name.isEmpty()) {
                Log.i("first ", "Se dio click $name")
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRANAME", name)
                startActivity(intent)

            }
        }
    }
}