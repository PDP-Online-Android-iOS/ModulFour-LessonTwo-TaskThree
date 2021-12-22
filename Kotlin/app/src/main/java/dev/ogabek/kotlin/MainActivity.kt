package dev.ogabek.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView() {
        val btnClickMe = findViewById<Button>(R.id.btn_click_me)
        btnClickMe.setOnClickListener {
            startActivity(Intent(this, PhotoActivity::class.java))
        }
    }

}