package com.example.sopt.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.sopt.Data.CommentData
import com.example.sopt.R
import kotlinx.android.synthetic.main.rv_item_comment.view.*
import org.jetbrains.anko.startActivity

class CommentRecyclerViewAdapter(val ctx: Context, val dataList: ArrayList<CommentData>): RecyclerView.Adapter<CommentRecyclerViewAdapter.Holder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_comment, viewGroup, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Glide.with(ctx)
                .load(dataList[position].img_url)
                .into(holder.img_thumnail)
        holder.name.text = dataList[position].name
        holder.date.text = dataList[position].date
        holder.comment.text = dataList[position].comment
    }

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        var img_thumnail = itemView.findViewById(R.id.img_rv_item_comment_thumbnail) as ImageView
        var name = itemView.findViewById(R.id.txt_rv_item_comment_name) as TextView
        var date = itemView.findViewById(R.id.txt_rv_item_comment_date) as TextView
        var comment = itemView.findViewById(R.id.txt_rv_item_comment_comment) as TextView
    }
}