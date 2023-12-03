package com.example.toktokbus

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity


class MainMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)

        val buttonBus = findViewById<LinearLayout>(R.id.btn_bus)
        buttonBus.setOnClickListener {
            val intent = Intent(this, ChooseBus::class.java)
            startActivity(intent)
        }
    }
}