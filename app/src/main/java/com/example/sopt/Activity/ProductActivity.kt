package com.example.sopt.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.example.sopt.Adapter.ProductRecyclerViewAdapter
import com.example.sopt.Data.ProductData
import com.example.sopt.R
import kotlinx.android.synthetic.main.activity_comment.*
import kotlinx.android.synthetic.main.activity_product.*
import kotlinx.android.synthetic.main.toolbar_product.*

class ProductActivity : AppCompatActivity() {

    var product_id = 0
    var productList = arrayListOf<ProductData>(
            ProductData("http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png", product_id,
                    0,"1화. 문어지지 말자!",13,"19.03.25"),
            ProductData("http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png", product_id,
                    1,"2화. 문어지지 말자!",13,"19.03.25"),
            ProductData("http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png", product_id,
                    2,"3화. 문어지지 말자!",13,"19.03.25"),
            ProductData("http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png", product_id,
                    3,"4화. 문어지지 말자!",13,"19.03.25"),
            ProductData("http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png", product_id,
                    4,"5화. 문어지지 말자!",13,"19.03.25"),
            ProductData("http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png", product_id,
                    5,"6화. 문어지지 말자!",13,"19.03.25"),
            ProductData("http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png", product_id,
                    6,"7화. 문어지지 말자!",13,"19.03.25"),
            ProductData("http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png", product_id,
                    7,"8화. 문어지지 말자!",13,"19.03.25")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        rv_product.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        rv_product.adapter = ProductRecyclerViewAdapter(this, productList)
        rv_product.layoutManager = LinearLayoutManager(this)

        var title = intent.getStringExtra("title")
        var product_id = intent.getIntExtra("idx", 0)
        txt_toolbar_product_title.text = title

        btn_toolbar_product_like.setOnClickListener {
            btn_toolbar_product_like.isSelected = !btn_toolbar_product_like.isSelected
        }

        btn_toolbar_product_back.setOnClickListener {
            finish()
        }


    }

}
