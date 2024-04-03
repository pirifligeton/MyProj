package com.pirifligeton.myprojhuaquisto.view.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.pirifligeton.myprojhuaquisto.R
import com.pirifligeton.myprojhuaquisto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Designation of buttons
        binding.btnMainLogin.setOnClickListener(this)
        binding.btnMainRegister.setOnClickListener(this)
        binding.btnMainHelp.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

    }
}