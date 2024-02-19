package com.example.projevize

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        var corba = findViewById<TextView>(R.id.textView3)
        var secilen = intent.getStringExtra("secim")
        corba.text = "$secilen"

        var sb = findViewById<SeekBar>(R.id.seekBar)
        var sb2 = findViewById<SeekBar>(R.id.seekBar2)
        var sarimsak = findViewById<Switch>(R.id.switch1)
        var nane = findViewById<Switch>(R.id.switch2)
        var dil = findViewById<Switch>(R.id.switch3)
        var terbiye = findViewById<Switch>(R.id.switch4)
        var beyin = findViewById<Switch>(R.id.switch5)
        var sirke = findViewById<Switch>(R.id.switch6)
        var kasar = findViewById<Switch>(R.id.switch7)
        var yag = findViewById<Switch>(R.id.switch8)
        var krema = findViewById<Switch>(R.id.switch9)
        var biber = findViewById<Switch>(R.id.switch10)
        var limon = findViewById<Switch>(R.id.switch11)
        var kitir = findViewById<Switch>(R.id.switch12)
        var sec = findViewById<Button>(R.id.button5)
        var istek = findViewById<EditText>(R.id.istek)

        sb.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if(p1 == 2){
                    var alert = AlertDialog.Builder (this@MainActivity4)
                    alert.setTitle("Uyarii!!")
                    alert.setMessage("Bu kadar tuz istediğinize emin misiniz?")
                    alert.setIcon(R.drawable.tuz)
                    alert.setCancelable(false)
                    alert.setPositiveButton("Evet"){DialogInterface,i ->
                        Toast.makeText(applicationContext,"Bol tuzlu Çorba",Toast.LENGTH_SHORT).show()
                    }
                    alert.setNegativeButton("Hayır"){DialogInterface,i ->
                        sb.setProgress(1)
                    }
                    alert.create().show()

                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })
        sb2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if(p1 == 2){
                    var alert = AlertDialog.Builder (this@MainActivity4)
                    alert.setTitle("Uyarii!!")
                    alert.setMessage("Bu kadar acı istediğinize emin misiniz?")
                    alert.setIcon(R.drawable.aci)
                    alert.setCancelable(false)
                    alert.setPositiveButton("Evet"){DialogInterface,i ->
                        Toast.makeText(applicationContext,"Bol acılı Çorba",Toast.LENGTH_SHORT).show()
                    }
                    alert.setNegativeButton("Hayır"){DialogInterface,i ->
                        sb2.setProgress(1)
                    }
                    alert.create().show()

                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })
        if (secilen == "Ezogelin Çorbası") {
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if (secilen == "Düğün Çorbası") {
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE


        }
        if (secilen == "Mercimek Çorbası") {
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if (secilen == "Brokoli Çorbası") {
            krema.visibility = View.VISIBLE


        }
        if (secilen == "Kelle-Paça Çorbası") {
            dil.visibility = View.VISIBLE
            sarimsak.visibility = View.VISIBLE
            beyin.visibility = View.VISIBLE
            sirke.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE


        }
        if (secilen == "Yayla Çorbası") {
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if (secilen == "Şehriye Çorbası") {
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if (secilen == "Domates Çorbası") {
            nane.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            kasar.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            terbiye.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if (secilen == "Tarhana Çorbası") {
            yag.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if (secilen == "Mantar Çorbası") {
            kasar.visibility = View.VISIBLE

        }
        if (secilen == "İşkembe Çorbası") {
            sarimsak.visibility = View.VISIBLE
            sirke.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }
        if (secilen == "Tavuk Çorbası") {
            krema.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE

        }
        sec.setOnClickListener{
            var siparis = corba.text.toString()

            var tuzmiktari = sb.progress.toString()
            var acımiktari = sb2.progress.toString()

            var sarimsakmiktari: String
            var nanemiktari: String
            var dilmiktari: String
            var terbiyemiktari: String
            var sirkemiktari: String
            var kremamiktari: String
            var yagmiktari: String
            var kasarmiktari: String
            var kitirmiktari: String
            var limonmiktari: String
            var bibermiktari: String
            var beyinmiktari: String

            var extraistek = istek.text.toString()


            if(sarimsak.isChecked){
                sarimsakmiktari="sarımsak,"
            }else{
                sarimsakmiktari=""
            }
            if(nane.isChecked){
                nanemiktari="nane,"
            }else{
                nanemiktari=""
            }
            if(dil.isChecked){
                dilmiktari="dil,"
            }else{
                dilmiktari=""
            }
            if(terbiye.isChecked){
                terbiyemiktari="terbiye,"
            }else{
                terbiyemiktari=""
            }
            if(sirke.isChecked){
                sirkemiktari="sirke,"
            }else{
                sirkemiktari=""
            }
            if(krema.isChecked){
                kremamiktari="krema,"
            }else{
                kremamiktari=""
            }
            if(yag.isChecked){
                yagmiktari="yağ,"
            }else{
                yagmiktari=""
            }
            if(kasar.isChecked){
                kasarmiktari="kaşar,"
            }else{
                kasarmiktari=""
            }
            if(kitir.isChecked){
                kitirmiktari="kıtır,"
            }else{
                kitirmiktari=""
            }
            if(limon.isChecked){
                limonmiktari="limon,"
            }else{
                limonmiktari=""
            }
            if(biber.isChecked){
                bibermiktari="biber,"
            }else{
                bibermiktari=""
            }
            if(beyin.isChecked){
                beyinmiktari="beyin,"
            }else{
                beyinmiktari=""
            }





            if(sb.progress==0){
                tuzmiktari="Tuzsuz"
            }
            if(sb.progress==1){
                tuzmiktari="Orta Tuzlu"
            }
            if(sb.progress==2){
                tuzmiktari="Bol Tuzlu"
            }
            if(sb2.progress==0){
                acımiktari="Acısız"
            }
            if(sb2.progress==1){
                acımiktari="Orta Acılı"
            }
            if(sb2.progress==2){
                acımiktari="Bol Acılı"
            }

            val uyar = AlertDialog.Builder(this)
            uyar.setTitle("Uyarı!")
            uyar.setMessage("Siparişiniz Hazırlanacak. Devam Etmek İstiyor musunuz ?")
            uyar.setIcon(R.drawable.carpi)
            uyar.setCancelable(false)
            uyar.setNeutralButton("TEKRAR KONTROL ETMEK İSTİYORUM") { DialogInterface, i ->

            }
            uyar.setPositiveButton("EVET") { DialogInterface, i ->
                Handler().postDelayed({
                    var gecis = Intent(applicationContext, MainActivity5::class.java)
                    gecis.putExtra("siparis", "Bir " +siparis+ " Çeeek, "+tuzmiktari+" ve "+acımiktari+" Olsun")

                    gecis.putExtra("icindekiler",sarimsakmiktari+nanemiktari+dilmiktari+terbiyemiktari+sirkemiktari+kremamiktari+yagmiktari+kasarmiktari+kitirmiktari+limonmiktari+bibermiktari+beyinmiktari)

                    gecis.putExtra("extraistek", "Ekstra istek : "+extraistek)
                    startActivity(gecis)
                    finish()
                }, 0)
            }
            uyar.create().show()
        }
    }
}