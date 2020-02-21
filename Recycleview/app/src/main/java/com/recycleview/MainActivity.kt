package com.recycleview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        recyclerView.adapter = SocialMediaAdapter(getSocialMedia())


    }

    private fun getSocialMedia():MutableList<SocialMedia>{

        return mutableListOf(
            SocialMedia("Instagram","https://bit.ly/2SJQXWK",2010),
            SocialMedia("Youtube","https://bit.ly/2uNWdiV",2005),
            SocialMedia("Linkedin","https://bit.ly/2SW5MnX",2003),
            SocialMedia("Twitter","https://bit.ly/2P73vVS",2006),
            SocialMedia("Facebook","https://bit.ly/2SX4bhD",2004),
            SocialMedia("Snapchat","https://bit.ly/2HFIH3G",2011),
            SocialMedia("Reddit","https://bit.ly/2PacDJn",2005),
            SocialMedia("Pinterest","https://bit.ly/2SGvlu2",2009)
        )
    }

}
