package com.example.sopt.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.sopt.R
import kotlinx.android.synthetic.main.toolbar_product.*
import kotlinx.android.synthetic.main.toolbar_view.*
import org.jetbrains.anko.startActivity

class ViewActivity : AppCompatActivity() {

    var product_id = 0
    var list_id = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        var title = intent.getStringExtra("title")
        var product_id = intent.getIntExtra("idx", 0)
        var list_id = intent.getIntExtra("list_id", 0)
        txt_toolbar_view_title.text = title

        btn_toolbar_view_comment.setOnClickListener {
            startActivity<CommentActivity>()
        }
        btn_toolbar_view_back.setOnClickListener {
            finish()
        }
    }
}
