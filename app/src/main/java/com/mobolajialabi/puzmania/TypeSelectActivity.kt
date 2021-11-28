package com.mobolajialabi.puzmania

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TypeSelectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_type_select)
        findViewById<Button>(R.id.riddles).setOnClickListener {
            startActivity(Intent(this, RiddleActivity::class.java))
        }

        findViewById<Button>(R.id.anagrams).setOnClickListener {
            startActivity(Intent(this, AnagramActivity::class.java))
        }
    }
}