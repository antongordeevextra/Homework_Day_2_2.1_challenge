package com.example.homework_day_2_21_challenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_day_2_21_challenge.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        binding = ActivitySecondBinding.inflate(layoutInflater).also { setContentView(it.root) }

        val intent = intent
        val id1 = intent.getStringExtra(MainActivity.TEXT_ONE)
        val id2 = intent.getStringExtra(MainActivity.TEXT_TWO)
        val id3 = intent.getStringExtra(MainActivity.TEXT_THREE)

        when {
            id1 != null -> {
                binding.text.text = resources.getString(R.string.text_one)
            }
            id2 != null -> {
                binding.text.text = resources.getString(R.string.text_two)
            }
            id3 != null -> {
                binding.text.text = resources.getString(R.string.text_three)
            }
        }
    }
}