package com.example.callbacks_maha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        Log.d("MainActivity3","onCreate :")
        Toast.makeText(this,"onCreate MainActivity3: ",Toast.LENGTH_LONG).show()

    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity3","onStart :")
        Toast.makeText(this,"onStart MainActivity3: ",Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity3","onResume :")
        Toast.makeText(this,"onResume MainActivity3: ",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity3","onPause :")
        Toast.makeText(this,"onPause MainActivity3: ",Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity3","onStop :")
        Toast.makeText(this,"onStop MainActivity3: ",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity3","onDestroy :")
        Toast.makeText(this,"onDestroy MainActivity3: ",Toast.LENGTH_LONG).show()
    }
}