package com.kotlin.randomnumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlin.math.floor
import kotlin.random.Random


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val myRandomNum = intent.getIntegerArrayListExtra("myRandomNumber")
        val passwordChar = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!#$&+"

        btn_generate_password.setOnClickListener {

            val randomIndex = floor(Math.random() * myRandomNum!!.size).toInt()
            var generatePassword = ""

            if(cb_control.isChecked){
                for (i in 0..8){
                    generatePassword += (passwordChar[floor(Math.random() * passwordChar.length).toInt()])
                }
                tv_password.text = (generatePassword.toString() + myRandomNum[randomIndex])
            }
            else
            {
                for (i in 0..8){
                    generatePassword += (passwordChar[floor(Math.random() * passwordChar.length).toInt()])
                }
                tv_password.text = generatePassword.toString()
            }
        }

    }
}