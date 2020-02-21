package com.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tv: TextView = findViewById(R.id.textView)

        val toggle: ToggleButton = findViewById(R.id.toggleButton)
        toggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                tv.visibility = View.VISIBLE
            } else {
                tv.visibility = View.INVISIBLE
            }
        }
    }
}
