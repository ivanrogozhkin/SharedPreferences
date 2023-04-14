package com.example.sharedpreferences

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val value = SharedPreferences.getValue(this)
        if (value != 0) {
            binding.textView.isVisible = false
        }

        binding.button.setOnClickListener {
            SharedPreferences.setValue(this, 1)
            binding.textView.isVisible = false
        }
    }
}