package com.example.android_first.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.android_first.R

class MainActivity : AppCompatActivity() {

    private  lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//navController=Navigation.findNavController(this, R.id.nav_host_fragment)

    }


}
