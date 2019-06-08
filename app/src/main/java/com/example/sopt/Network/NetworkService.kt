package com.example.sopt.Network

import com.example.sopt.Network.Get.GetMainProductListResponse
import com.example.sopt.Network.Post.PostLoginResponse
import com.example.sopt.Network.Post.PostSignupResponse
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.*

interface NetworkService {
    @POST("/api/auth/signin")
    fun postLoginResponse(
            @Header("Content-Type") content_type: String,
            @Body() body:JsonObject
    ): Call<PostLoginResponse>

    @POST("/api/auth/signup")
    fun postSignupResponse(
            @Header("Content-Type") content_type: String,
            @Body() body:JsonObject
    ): Call<PostSignupResponse>

    @GET("/api/webtoons/main/{flag}")
    fun getMainProductListResponse(
            @Header("Content-Type") content_type: String,
            @Path("flag") flag: Int
    ): Call<GetMainProductListResponse>
}