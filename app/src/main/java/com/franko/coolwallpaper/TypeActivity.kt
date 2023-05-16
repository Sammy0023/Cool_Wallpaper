package com.franko.coolwallpaper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.franko.coolwallpaper.databinding.ActivityTypeBinding

class TypeActivity : AppCompatActivity() {
    lateinit var binding: ActivityTypeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTypeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.firstButton.setOnClickListener {
            startActivity(Intent(this, NatureActivity::class.java))
        }

        binding.thirdButton.setOnClickListener {
            startActivity(Intent(this, TechnologyActivity::class.java))
        }
    }
}