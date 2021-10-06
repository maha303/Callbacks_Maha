package com.example.callbacks_maha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Toast.makeText(this, "onCreate MainActivity2", Toast.LENGTH_LONG).show()
        Log.d("MainActivity2", "onCreate :")

        val myBtn2 = findViewById<Button>(R.id.button2)
        myBtn2.setOnClickListener{
            val intent2 = Intent(this,MainActivity3::class.java)
            startActivity(intent2)
        }

    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart MainActivity2", Toast.LENGTH_LONG).show()
        Log.d("MainActivity2", "onStart :")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume MainActivity2", Toast.LENGTH_LONG).show()
        Log.d("MainActivity2", "onResume :")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause MainActivity2", Toast.LENGTH_LONG).show()
        Log.d("MainActivity2", "onPause :")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop MainActivity2", Toast.LENGTH_LONG).show()
        Log.d("MainActivity2", "onStop :")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy MainActivity2", Toast.LENGTH_LONG).show()
        Log.d("MainActivity2", "onDestroy :")
    }
}