package com.example.sopt.Network.Get

import com.example.sopt.Data.ProductOverviewData

data class GetMainProductListResponse(
        val status: Int,
        val success: Boolean,
        val message: String,
        val data: ArrayList<ProductOverviewData>?
)