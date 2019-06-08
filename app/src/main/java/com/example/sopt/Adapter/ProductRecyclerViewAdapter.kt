package com.example.sopt.Adapter

import android.content.Context
import android.support.v4.app.FragmentManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.sopt.Activity.ProductActivity
import com.example.sopt.Activity.ViewActivity
import com.example.sopt.Data.ProductData
import com.example.sopt.R
import org.jetbrains.anko.startActivity

class ProductRecyclerViewAdapter(val ctx: Context, val dataList: ArrayList<ProductData>): RecyclerView.Adapter<ProductRecyclerViewAdapter.Holder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_product, viewGroup, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Glide.with(ctx)
                .load(dataList[position].img_url)
                .into(holder.img_thumnail)
        holder.title.text = dataList[position].title
        holder.num_view.text = "조회수" + dataList[position].num_view.toString() +"만회"
        holder.date.text = dataList[position].date

        holder.container.setOnClickListener {
            ctx.startActivity<ViewActivity>(
                    "idx" to dataList[position].product_id,
                    "list_id" to dataList[position].list_id,
                    "title" to dataList[position].title)
        }
    }

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        var container = itemView.findViewById(R.id.ll_rv_item_product_container) as LinearLayout
        var img_thumnail = itemView.findViewById(R.id.img_rv_item_product_thumbnail) as ImageView
        var title = itemView.findViewById(R.id.txt_rv_item_product_title) as TextView
        var num_view = itemView.findViewById(R.id.txt_rv_item_product_numview) as TextView
        var date = itemView.findViewById(R.id.txt_rv_item_product_date) as TextView
    }
}