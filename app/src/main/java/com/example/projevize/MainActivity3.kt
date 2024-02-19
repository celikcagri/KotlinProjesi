package com.example.projevize

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var checkbox = findViewById<CheckBox>(R.id.checkBox)
        var corbalar = findViewById<RadioGroup>(R.id.corbalar)
        var devam = findViewById<Button>(R.id.button6)
        var ezogelin = findViewById<Button>(R.id.ezogelin)
        var dugun = findViewById<Button>(R.id.dugun)
        var mercimek = findViewById<Button>(R.id.mercimek)
        var brokoli = findViewById<Button>(R.id.brokoli)
        var kellepaca = findViewById<Button>(R.id.kellepaca)
        var yayla = findViewById<Button>(R.id.yayla)
        var sehriye = findViewById<Button>(R.id.sehriye)
        var domates = findViewById<Button>(R.id.domates)
        var tarhana = findViewById<Button>(R.id.tarhana)
        var mantar = findViewById<Button>(R.id.mantar)
        var iskembe = findViewById<Button>(R.id.iskembe)
        var tavuk = findViewById<Button>(R.id.tavuk)
        checkbox.setOnClickListener {
            corbalar.visibility = View.VISIBLE
            devam.visibility = View.VISIBLE
        }
        ezogelin.setOnClickListener{
            devam.setOnClickListener{
                val bilgi ="${ezogelin.text}"
                var ozeltoast = layoutInflater.inflate(R.layout.toast,null)
                var text2 = ozeltoast.findViewById<TextView>(R.id.textView)
                text2.text = "$bilgi Çorbası "

                var toastozel = Toast(applicationContext)
                toastozel.view = ozeltoast
                toastozel.setGravity(Gravity.BOTTOM,0,0)
                toastozel.duration = Toast.LENGTH_SHORT

                toastozel.show()
                Handler().postDelayed({
                    var gecis = Intent(applicationContext,MainActivity4::class.java)
                    gecis.putExtra("secim","$bilgi Çorbası")
                    startActivity(gecis)
                    finish()
                },3000)
            }
        }
        dugun.setOnClickListener{
            devam.setOnClickListener{
                val bilgi ="${dugun.text}"
                var ozeltoast = layoutInflater.inflate(R.layout.toast,null)
                var text2 = ozeltoast.findViewById<TextView>(R.id.textView)
                text2.text = "$bilgi Çorbası "

                var toastozel = Toast(applicationContext)
                toastozel.view = ozeltoast
                toastozel.setGravity(Gravity.BOTTOM,0,0)
                toastozel.duration = Toast.LENGTH_SHORT

                toastozel.show()
                Handler().postDelayed({
                    var gecis = Intent(applicationContext,MainActivity4::class.java)
                    gecis.putExtra("secim","$bilgi Çorbası")
                    startActivity(gecis)
                    finish()
                },3000)
            }
        }
        mercimek.setOnClickListener{
            devam.setOnClickListener{
                val bilgi ="${mercimek.text}"
                var ozeltoast = layoutInflater.inflate(R.layout.toast,null)
                var text2 = ozeltoast.findViewById<TextView>(R.id.textView)
                text2.text = "$bilgi Çorbası "

                var toastozel = Toast(applicationContext)
                toastozel.view = ozeltoast
                toastozel.setGravity(Gravity.BOTTOM,0,0)
                toastozel.duration = Toast.LENGTH_SHORT

                toastozel.show()
                Handler().postDelayed({
                    var gecis = Intent(applicationContext,MainActivity4::class.java)
                    gecis.putExtra("secim","$bilgi Çorbası")
                    startActivity(gecis)
                    finish()
                },3000)
            }
        }
        brokoli.setOnClickListener{
            devam.setOnClickListener{
                val bilgi ="${brokoli.text}"
                var ozeltoast = layoutInflater.inflate(R.layout.toast,null)
                var text2 = ozeltoast.findViewById<TextView>(R.id.textView)
                text2.text = "$bilgi Çorbası "

                var toastozel = Toast(applicationContext)
                toastozel.view = ozeltoast
                toastozel.setGravity(Gravity.BOTTOM,0,0)
                toastozel.duration = Toast.LENGTH_SHORT

                toastozel.show()
                Handler().postDelayed({
                    var gecis = Intent(applicationContext,MainActivity4::class.java)
                    gecis.putExtra("secim","$bilgi Çorbası")
                    startActivity(gecis)
                    finish()
                },3000)
            }
        }
        kellepaca.setOnClickListener{
            devam.setOnClickListener{
                val bilgi ="${kellepaca.text}"
                var ozeltoast = layoutInflater.inflate(R.layout.toast,null)
                var text2 = ozeltoast.findViewById<TextView>(R.id.textView)
                text2.text = "$bilgi Çorbası "

                var toastozel = Toast(applicationContext)
                toastozel.view = ozeltoast
                toastozel.setGravity(Gravity.BOTTOM,0,0)
                toastozel.duration = Toast.LENGTH_SHORT

                toastozel.show()
                Handler().postDelayed({
                    var gecis = Intent(applicationContext,MainActivity4::class.java)
                    gecis.putExtra("secim","$bilgi Çorbası")
                    startActivity(gecis)
                    finish()
                },3000)
            }
        }
        yayla.setOnClickListener{
            devam.setOnClickListener{
                val bilgi ="${yayla.text}"
                var ozeltoast = layoutInflater.inflate(R.layout.toast,null)
                var text2 = ozeltoast.findViewById<TextView>(R.id.textView)
                text2.text = "$bilgi Çorbası "

                var toastozel = Toast(applicationContext)
                toastozel.view = ozeltoast
                toastozel.setGravity(Gravity.BOTTOM,0,0)
                toastozel.duration = Toast.LENGTH_SHORT

                toastozel.show()
                Handler().postDelayed({
                    var gecis = Intent(applicationContext,MainActivity4::class.java)
                    gecis.putExtra("secim","$bilgi Çorbası")
                    startActivity(gecis)
                    finish()
                },3000)
            }
        }
        sehriye.setOnClickListener{
            devam.setOnClickListener{
                val bilgi ="${sehriye.text}"
                var ozeltoast = layoutInflater.inflate(R.layout.toast,null)
                var text2 = ozeltoast.findViewById<TextView>(R.id.textView)
                text2.text = "$bilgi Çorbası "

                var toastozel = Toast(applicationContext)
                toastozel.view = ozeltoast
                toastozel.setGravity(Gravity.BOTTOM,0,0)
                toastozel.duration = Toast.LENGTH_SHORT

                toastozel.show()
                Handler().postDelayed({
                    var gecis = Intent(applicationContext,MainActivity4::class.java)
                    gecis.putExtra("secim","$bilgi Çorbası")
                    startActivity(gecis)
                    finish()
                },3000)
            }
        }
        domates.setOnClickListener{
            devam.setOnClickListener{
                val bilgi ="${domates.text}"
                var ozeltoast = layoutInflater.inflate(R.layout.toast,null)
                var text2 = ozeltoast.findViewById<TextView>(R.id.textView)
                text2.text = "$bilgi Çorbası "

                var toastozel = Toast(applicationContext)
                toastozel.view = ozeltoast
                toastozel.setGravity(Gravity.BOTTOM,0,0)
                toastozel.duration = Toast.LENGTH_SHORT

                toastozel.show()
                Handler().postDelayed({
                    var gecis = Intent(applicationContext,MainActivity4::class.java)
                    gecis.putExtra("secim","$bilgi Çorbası")
                    startActivity(gecis)
                    finish()
                },3000)
            }
        }
        tarhana.setOnClickListener{
            devam.setOnClickListener{
                val bilgi ="${tarhana.text}"
                var ozeltoast = layoutInflater.inflate(R.layout.toast,null)
                var text2 = ozeltoast.findViewById<TextView>(R.id.textView)
                text2.text = "$bilgi Çorbası "

                var toastozel = Toast(applicationContext)
                toastozel.view = ozeltoast
                toastozel.setGravity(Gravity.BOTTOM,0,0)
                toastozel.duration = Toast.LENGTH_SHORT

                toastozel.show()
                Handler().postDelayed({
                    var gecis = Intent(applicationContext,MainActivity4::class.java)
                    gecis.putExtra("secim","$bilgi Çorbası")
                    startActivity(gecis)
                    finish()
                },3000)
            }
        }
        mantar.setOnClickListener{
            devam.setOnClickListener{
                val bilgi ="${mantar.text}"
                var ozeltoast = layoutInflater.inflate(R.layout.toast,null)
                var text2 = ozeltoast.findViewById<TextView>(R.id.textView)
                text2.text = "$bilgi Çorbası "

                var toastozel = Toast(applicationContext)
                toastozel.view = ozeltoast
                toastozel.setGravity(Gravity.BOTTOM,0,0)
                toastozel.duration = Toast.LENGTH_SHORT

                toastozel.show()
                Handler().postDelayed({
                    var gecis = Intent(applicationContext,MainActivity4::class.java)
                    gecis.putExtra("secim","$bilgi Çorbası")
                    startActivity(gecis)
                    finish()
                },3000)
            }
        }
        iskembe.setOnClickListener{
            devam.setOnClickListener{
                val bilgi ="${iskembe.text}"
                var ozeltoast = layoutInflater.inflate(R.layout.toast,null)
                var text2 = ozeltoast.findViewById<TextView>(R.id.textView)
                text2.text = "$bilgi Çorbası "

                var toastozel = Toast(applicationContext)
                toastozel.view = ozeltoast
                toastozel.setGravity(Gravity.BOTTOM,0,0)
                toastozel.duration = Toast.LENGTH_SHORT

                toastozel.show()
                Handler().postDelayed({
                    var gecis = Intent(applicationContext,MainActivity4::class.java)
                    gecis.putExtra("secim","$bilgi Çorbası")
                    startActivity(gecis)
                    finish()
                },3000)
            }
        }
        tavuk.setOnClickListener{
            devam.setOnClickListener{
                val bilgi ="${tavuk.text}"
                var ozeltoast = layoutInflater.inflate(R.layout.toast,null)
                var text2 = ozeltoast.findViewById<TextView>(R.id.textView)
                text2.text = "$bilgi Çorbası "

                var toastozel = Toast(applicationContext)
                toastozel.view = ozeltoast
                toastozel.setGravity(Gravity.BOTTOM,0,0)
                toastozel.duration = Toast.LENGTH_SHORT

                toastozel.show()
                Handler().postDelayed({
                    var gecis = Intent(applicationContext,MainActivity4::class.java)
                    gecis.putExtra("secim","$bilgi Çorbası")
                    startActivity(gecis)
                    finish()
                },3000)
            }
        }
        devam.setOnClickListener {
            val alert = AlertDialog.Builder(this)
            alert.setCancelable(false)
            alert.setTitle("Uyarı!")
            alert.setMessage("Lüften Seçiminizi Yapınız")
            alert.setIcon(R.drawable.logo)
            alert.setNeutralButton("Tekrar dene"){DialogInterface,i->
            }
            alert.create().show()
        }
    }
}