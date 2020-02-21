package com.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_socialmedia.view.*


class SocialMediaAdapter(val socialMedia: MutableList<SocialMedia>) :
    RecyclerView.Adapter<SocialMediaAdapter.SocialMediaViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SocialMediaAdapter.SocialMediaViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.item_socialmedia, parent, false)
        return SocialMediaViewHolder(v)
    }

    override fun getItemCount(): Int {
        return socialMedia.size
    }

    fun add(item: SocialMedia) {
        val positon = socialMedia.indexOf(item)
        socialMedia.removeAt(positon)
        notifyItemRemoved(positon)
    }

    fun remove(item:SocialMedia) {
        val position = socialMedia.indexOf(item)
        socialMedia.removeAt(position)
        notifyItemRemoved(position)
    }


    override fun onBindViewHolder(holder: SocialMediaViewHolder, position: Int) {
        val social = socialMedia[position]
        holder.itemView.txtSocialMedia.text = social.name
        holder.itemView.txtFoundingYear.text = social.foundingYear.toString()
        Picasso.get().load(social.imageUrl).into(holder.itemView.imgLogo)
        holder.itemView.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "${social.name} is the best social media in the world.",
                Toast.LENGTH_SHORT
            ).show()
        }
        holder.itemView.setOnLongClickListener {
            remove(social)
            return@setOnLongClickListener true
        }

    }

    class SocialMediaViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView)
}