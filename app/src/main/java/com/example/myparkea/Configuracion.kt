package com.example.myparkea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate

class Configuracion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracion)

        val switch = findViewById<Switch>(R.id.dark_mode)
        switch.setOnCheckedChangeListener { _, _ ->
            if (switch.isChecked){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                switch.text = "Desactivar modo oscuro: "
            }
            else{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                switch.text = "Activar modo oscuro: "
            }
        }
    }
}