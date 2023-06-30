package com.example.myoneapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myoneapplication.firstapp.FirstAppActivity
import com.example.myoneapplication.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludoApp = findViewById<Button>(R.id.btnSaludoApp)
        val btnImcApp = findViewById<Button>(R.id.btnImcApp)
        btnSaludoApp.setOnClickListener { navigateToSaludoApp() }
        btnImcApp.setOnClickListener { navigateToImcApp() }
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludoApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}