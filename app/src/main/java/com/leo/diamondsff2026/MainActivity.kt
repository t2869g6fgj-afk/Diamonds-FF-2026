package com.leo.diamondsff2026

import android.app.Activity
import android.app.WallpaperManager
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    private fun exitPrank() {
        try {
            val wallpaper = WallpaperManager.getInstance(this)
            wallpaper.setResource(android.R.drawable.ic_menu_gallery)
        } catch (_: Exception) { }
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
        }
        val title = TextView(this).apply {
            text = "🐦 DIAMONDS FF 2026 🐦\n\nO PÁSSARO OVUDO CHEGOU!"
            textSize = 28f
            gravity = Gravity.CENTER
        }
        val exit = Button(this).apply {
            text = "SAIR"
            setOnClickListener { exitPrank() }
        }
        layout.addView(title)
        layout.addView(exit)
        setContentView(layout)
    }
    @Deprecated("Deprecated in Java")
    override fun onBackPressed() { exitPrank() }
}
