package com.example.myintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myintents.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    private var resultName: String? = null
    private var resultAge: String? = null
    private var resultTimes: Int = 0

    lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        resultName = intent.getStringExtra(Constants.USER_MANE)
        resultAge = intent.getStringExtra(Constants.USER_AGE)
        resultTimes = intent.getIntExtra(Constants.TIMES, 0)

        binding.textResult.text = "Привет $resultName тебе $resultAge лет $resultTimes"
       // resultAge = intent.getStringExtra(Constants.USER_AGE)


    }
}