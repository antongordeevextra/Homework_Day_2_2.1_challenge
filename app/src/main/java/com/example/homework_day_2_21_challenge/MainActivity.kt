package com.example.homework_day_2_21_challenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun textOne(view: android.view.View) {
        val intent = Intent(this, SecondActivity::class.java)
        val id = "1"
        intent.putExtra(TEXT_ONE, id)
        startActivity(intent)
    }

    fun textTwo(view: android.view.View) {
        val intent = Intent(this, SecondActivity::class.java)
        val id = "2"
        intent.putExtra(TEXT_TWO, id)
        startActivity(intent)
    }

    fun textThree(view: android.view.View) {
        val intent = Intent(this, SecondActivity::class.java)
        val id = "3"
        intent.putExtra(TEXT_THREE, id)
        startActivity(intent)
    }

    companion object {
        const val TEXT_ONE = "button_one"
        const val TEXT_TWO = "button_two"
        const val TEXT_THREE = "button_three"
    }
}