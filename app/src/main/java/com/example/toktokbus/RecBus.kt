package com.example.toktokbus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.LinearLayout

class RecBus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rec_bus)

        val startCamButton: Button = findViewById(R.id.startcambtn)
        startCamButton.setOnClickListener {
            val intent = Intent(this, CameraTest::class.java)
            startActivity(intent)
        }

    }
}