package com.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CompoundButton
import android.widget.ToggleButton
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toggle: ToggleButton = findViewById(R.id.toggle_button)
        toggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                changeFragment(FragmentTwo())
            } else
                changeFragment(FragmentOne())
        }

    }

    private fun changeFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }
}
