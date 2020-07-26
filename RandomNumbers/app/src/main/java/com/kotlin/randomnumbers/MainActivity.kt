package com.kotlin.randomnumbers

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myRandomNumber = arrayListOf<Int>()


        btn_generate_number.setOnClickListener {
            val max = et_max_value.text.toString().toInt()
            val min = et_min_value.text.toString().toInt()
            val count = et_num_count.text.toString().toInt()

            val randomNumber = List(count){
                Random.nextInt(min,max)
            }

            tv_generated_number.text = randomNumber.toString()
            myRandomNumber.addAll(randomNumber)
            Toast.makeText(this@MainActivity,myRandomNumber.toString(),Toast.LENGTH_SHORT).show()

        }

        btn_generate_password_page.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            intent.putIntegerArrayListExtra("myRandomNumber",myRandomNumber)
            startActivity(intent)

        }

    }
}