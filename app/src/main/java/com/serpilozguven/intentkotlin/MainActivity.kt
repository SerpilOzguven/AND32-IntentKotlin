package com.serpilozguven.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.serpilozguven.intentkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        println("onCreate executed")

    }

    override fun onStart() {
        super.onStart()
        println("onStart executed")
    }

    override fun onResume() {
        super.onResume()
        println("onResume executed")
    }

    override fun onPause() {
        super.onPause()
        println("onPause executed")
    }

    override fun onStop() {
        super.onStop()
        println("onStop executed")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy executed")
    }

    fun next(view: View) {
        val intent = Intent(this@MainActivity,NextActivity::class.java)
        intent.putExtra("name",binding.editText.text.toString())
        //intent.putExtra("surname","serpilozguven")
        intent.putExtra("myinteger",10)
        startActivity(intent)
        finish()

    }
}