package com.example.callbacks_maha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var myBtnMain : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "onCreate MainActivity1", Toast.LENGTH_LONG).show()
        Log.d("MainActivity1", "onCreate :")
        myBtnMain = findViewById(R.id.btnMain)

        myBtnMain.setOnClickListener {

                val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }}


         override fun onStart() {
            super.onStart()
            Toast.makeText(this, "onStart MainActivity1", Toast.LENGTH_LONG).show()
            Log.d("MainActivity1", "onStart :")
        }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume MainActivity1", Toast.LENGTH_LONG).show()
        Log.d("MainActivity1", "onResume :")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause MainActivity1", Toast.LENGTH_LONG).show()
        Log.d("MainActivity1", "onPause :")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop MainActivity1", Toast.LENGTH_LONG).show()
        Log.d("MainActivity1", "onStop :")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy MainActivity1", Toast.LENGTH_LONG).show()
        Log.d("MainActivity1", "onDestroy :")
    }
   }
