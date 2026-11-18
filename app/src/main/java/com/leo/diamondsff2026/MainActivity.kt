package com.leo.diamondsff2026

import android.app.Activity
import android.app.WallpaperManager
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_FULLSCREEN
            or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
            or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(24, 24, 24, 24)
            setBackgroundColor(0xFFF6D66A.toInt())
        }
        val picture = ImageView(this).apply {
            setImageResource(R.drawable.passaro_ovudo)
            scaleType = ImageView.ScaleType.FIT_CENTER
            contentDescription = "Pássaro ovudo"
        }
        layout.addView(picture, LinearLayout.LayoutParams(-1, 0, 1f))
        val title = TextView(this).apply {
            text = "DIAMONDS FF 2026"
            textSize = 25f
            gravity = Gravity.CENTER
            setTextColor(0xFF172B55.toInt())
        }
        layout.addView(title)
        val exit = Button(this).apply {
            text = "SAIR"
            textSize = 20f
            setOnClickListener { exitPrank() }
        }
        layout.addView(exit, LinearLayout.LayoutParams(-1, -2))
        setContentView(layout)
    }

    private fun exitPrank() {
        try {
            WallpaperManager.getInstance(this).setResource(R.drawable.passaro_ovudo)
            Toast.makeText(this, "Papel de parede aplicado!", Toast.LENGTH_SHORT).show()
        } catch (_: Exception) {
            Toast.makeText(this, "Não foi possível aplicar o papel de parede.", Toast.LENGTH_LONG).show()
        }
        finish()
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() { exitPrank() }
}