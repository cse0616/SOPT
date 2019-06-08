package com.example.sopt.Activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.example.sopt.Adapter.CommentRecyclerViewAdapter
import com.example.sopt.Data.CommentData
import com.example.sopt.R
import kotlinx.android.synthetic.main.activity_comment.*
import kotlinx.android.synthetic.main.toolbar_comment.*
import kotlinx.android.synthetic.main.toolbar_product.*

class CommentActivity : AppCompatActivity() {

    var product_id = 0
    var list_id = 0
    var commentList = arrayListOf<CommentData>(
            CommentData("http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
                    product_id, list_id, 0, "솝러버","19.03.25 23.21.38", "문어에 대한 내용이 아주 유익하네요. 추천드려요! 다들 꼭 보시길~^^"),
            CommentData("http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
                    product_id, list_id, 0, "문어","19.03.25 23.21.38", "히히"),
            CommentData("http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
                    product_id, list_id, 1, "성은","19.03.25 23.21.38", "히히"),
            CommentData("http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
                    product_id, list_id, 1, "윤희","19.03.25 23.21.38", "히히")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comment)

        rv_comment.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        rv_comment.adapter = CommentRecyclerViewAdapter(this, commentList)
        rv_comment.layoutManager = LinearLayoutManager(this)

        btn_toolbar_comment_back.setOnClickListener {
            finish()
        }
        btn_comment.setOnClickListener{

        }
    }
}