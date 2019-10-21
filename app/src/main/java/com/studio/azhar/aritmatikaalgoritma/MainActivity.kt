package com.studio.azhar.aritmatikaalgoritma

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.studio.azhar.aritmatikaalgoritma.R.id.tv_Hasil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setLogo(R.drawable.ic_launcher_background)
        supportActionBar!!.setDisplayUseLogoEnabled(true)

        btn_Hitung.setOnClickListener {
        hitung()
        }
    }

    fun hitung() {
        val a = edt_Angka1.text.toString().trim().toIntOrNull()?:0
        val b = edt_Angka2.text.toString().trim().toIntOrNull()?:0



        val hasil = a + b

        tv_Hasil.setText(hasil.toString())



    }
}
