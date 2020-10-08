package com.jatin.activitylifecyclekotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("jv","onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("jv","onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("jv","onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("jv","onStop")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("jv","onRestart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("jv","onDestroy")

    }

}