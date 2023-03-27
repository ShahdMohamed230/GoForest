package com.example.goforest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.goforest.databinding.ActivityForestBinding
import com.example.goforest.databinding.ActivitySplashBinding
class ForestActivity : AppCompatActivity() {
    lateinit var binding: ActivityForestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvName.text=name?:"mohamed"
    }
}