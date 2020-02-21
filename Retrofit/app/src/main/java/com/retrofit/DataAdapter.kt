package com.retrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_data.view.*

class DataAdapter(val data: MutableList<Data>) :
    RecyclerView.Adapter<DataAdapter.SocialMediaViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DataAdapter.SocialMediaViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.item_data, parent, false)
        return SocialMediaViewHolder(v)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: SocialMediaViewHolder, position: Int) {
        val datad = data[position]
        holder.itemView.data_userId.text = datad.userId.toString()
        holder.itemView.data_Id.text = datad.id.toString()
        holder.itemView.data_body.text = datad.body
        holder.itemView.data_title.text = datad.title


    }

    class SocialMediaViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView)
}
