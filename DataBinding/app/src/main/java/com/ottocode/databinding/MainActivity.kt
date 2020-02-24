package com.ottocode.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ottocode.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mBind: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        val user = User("Otto Code", "1234-4567-8900-0000", "123", "12/20")


        mBind.fetchData.setOnClickListener {
            mBind.setVariable(BR.user, user)
            mBind.executePendingBindings()
        }


    }
}

