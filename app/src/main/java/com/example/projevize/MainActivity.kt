package com.example.projevize

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var isim = findViewById<TextView>(R.id.textView)
        object : CountDownTimer(1000,60) {
            var z = 1
            override fun onTick(p0: Long) {
                isim.setTextSize(z.toFloat())
                z = z + 3
            }

            override fun onFinish() {
                Handler().postDelayed({
                    var gecis = Intent(applicationContext,MainActivity2::class.java)
                    startActivity(gecis)
                    finish()
                },5000)
            }
        }.start()
    }
}