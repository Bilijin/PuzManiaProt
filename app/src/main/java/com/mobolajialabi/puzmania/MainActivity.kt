package com.mobolajialabi.puzmania

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.levels).setOnClickListener {
            startActivity(Intent(this, TypeSelectActivity::class.java))
        }
        findViewById<Button>(R.id.exit).setOnClickListener {
            exitProcess(0)
        }

    }

}