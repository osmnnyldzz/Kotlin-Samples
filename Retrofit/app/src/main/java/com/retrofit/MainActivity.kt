package com.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)

        RetrofitClient.getClient().create(DataService::class.java)
            .getDatas().enqueue(object : retrofit2.Callback<List<Data>> {
                override fun onFailure(call: Call<List<Data>>, t: Throwable) {
                    Toast.makeText(this@MainActivity, "Failure", Toast.LENGTH_LONG).show()

                }

                override fun onResponse(call: Call<List<Data>>, response: Response<List<Data>>) {
                    val dataList = ArrayList(response.body())

                    Toast.makeText(this@MainActivity, "Succes", Toast.LENGTH_LONG).show()
                    recyclerView.adapter = DataAdapter(dataList)
                }
            })
    }
}
