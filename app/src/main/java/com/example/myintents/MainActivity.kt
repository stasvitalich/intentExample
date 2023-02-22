package com.example.myintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.myintents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var times = 100

        binding.button1.setOnClickListener {
            var intent = Intent(this, MainActivity3::class.java)
            intent.putExtra(Constants.USER_MANE, binding.editTextName.text.toString())
            intent.putExtra(Constants.USER_AGE, binding.editTextAge.text.toString())
            intent.putExtra(Constants.TIMES, times)
            startActivity(intent)
            finish()
        }
    }

}