package com.example.after

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.after.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    lateinit var Binding : ActivityMainBinding
    var number :Int =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(Binding.root)
        Binding.button2.setOnClickListener {
            Binding.text2.setText(number++.toString())
        }



//        findViewById<TextView>(R.id.text2)
//      binding.button.setOnClickListener {
//
//      }

      }


    }
