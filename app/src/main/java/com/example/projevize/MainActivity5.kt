package com.example.projevize

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val intent = intent
        var blink = findViewById<TextView>(R.id.siparis)
        object : CountDownTimer(5000,500) {
            override fun onTick(p0: Long) {

                if (blink.visibility == View.VISIBLE ) {
                    blink.visibility = View.INVISIBLE
                } else {
                    blink.visibility = View.VISIBLE
                }
            }
            override fun onFinish() {
            }

        }.start()

        var yaz = findViewById<TextView>(R.id.textView9)
        var text = intent.getStringExtra("siparis")
        yaz.text = text


        var yaz2=findViewById<TextView>(R.id.textView11)
        var text2=intent.getStringExtra("icindekiler")
        yaz2.text=text2


        var yaz3=findViewById<TextView>(R.id.textView13)
        var text3=intent.getStringExtra("extraistek")
        yaz3.text=text3


        var yeni=findViewById<Button>(R.id.siparis)
        var cikis=findViewById<ImageButton>(R.id.imageButton3)



        yeni.setOnClickListener{
            var gec= Intent(this,MainActivity3::class.java)
            startActivity(gec)
            finish()
        }
        cikis.setOnClickListener{
            val alert= AlertDialog.Builder(this)
            alert.setCancelable(false)
            alert.setTitle("Çıkış")
            alert.setMessage("Çıkmak istediğinize emin misiniz ?")
            alert.setIcon(R.drawable.logo)
            alert.setPositiveButton("Evet"){DialogInterface,i->
                finish()
            }
            alert.setNegativeButton("Hayır") { DialogInterface, i ->

            }
            alert.create().show()
        }
    }
}