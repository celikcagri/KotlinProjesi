package com.example.projevize

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var ilerleme = findViewById<ProgressBar>(R.id.ilerleme)
        var isim1 = findViewById<Button>(R.id.isim1)
        var isim2 = findViewById<Button>(R.id.isim2)
        var isim3 = findViewById<Button>(R.id.isim3)
        var isim4 = findViewById<Button>(R.id.isim4)
        var isim5 = findViewById<Button>(R.id.isim5)
        var tick1 = findViewById<ImageView>(R.id.tick1)
        var tick2 = findViewById<ImageView>(R.id.tick2)
        var tick3 = findViewById<ImageView>(R.id.tick3)
        var tick4 = findViewById<ImageView>(R.id.tick4)
        var tick5 = findViewById<ImageView>(R.id.tick5)
        isim1.setOnClickListener {
            tick1.visibility = View.VISIBLE
            isim2.setOnClickListener {
                tick2.visibility = View.VISIBLE
                isim3.setOnClickListener {
                    tick3.visibility = View.VISIBLE
                    isim4.setOnClickListener {
                        tick4.visibility = View.VISIBLE
                        isim5.setOnClickListener {
                            tick5.visibility = View.VISIBLE
                            ilerleme.visibility = View.VISIBLE
                            Handler().postDelayed({
                                val gec = Intent(applicationContext,MainActivity3::class.java)
                                startActivity(gec)
                                finish()
                            },3000)

                        }
                    }
                }
            }
        }
    }
}