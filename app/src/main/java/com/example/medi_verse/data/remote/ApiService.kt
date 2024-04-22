package com.example.medi_verse.data.remote

import com.example.medi_verse.data.remote.model.AuthResponse
import com.example.medi_verse.data.remote.model.GetPost
import com.example.medi_verse.data.remote.model.LoginRequest
import com.example.medi_verse.data.remote.model.Post
import com.example.medi_verse.data.remote.model.RegisterRequest
import com.example.requests.ClubLoginRequest
import com.example.utils.Constants.ADMIN_LOGIN
import com.example.utils.Constants.CREATE_END_POINT
import com.example.utils.Constants.LOGIN_CLUB_ADMIN
import com.example.utils.Constants.LOGIN_END_POINT
import com.example.utils.Constants.REGISTER_END_POINT
import com.example.utils.Constants.RETRIEVE_END_POINT
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {
    companion object{
        const val BASE_URL = "https://aaryaworks.tech/"
    }

    //for users (student)
    @Headers("Content-Type: application/json")
    @POST(REGISTER_END_POINT)
    suspend fun createUserAccount(
        @Body user:RegisterRequest
    ): AuthResponse

    @Headers("Content-Type: application/json")
    @POST(LOGIN_END_POINT)
    suspend fun loginUser(
        @Body user:LoginRequest
    ): AuthResponse

    //For Club
//    @Headers("Content-Type: application/json")
//    @POST(REGISTER_END_POINT)
//    suspend fun createUserAccount(
//        @Body user:RegisterRequest
//    ): AuthResponse

    @Headers("Content-Type: application/json")
    @POST(LOGIN_CLUB_ADMIN)
    suspend fun loginClub(
        @Body club: ClubLoginRequest
    ): AuthResponse


    //for college admin
  @Headers("Content-Type: application/json")
    @POST(ADMIN_LOGIN)
    suspend fun loginAdmin(
        @Body admin:LoginRequest
    ): AuthResponse


    //Post
    @Headers("Content-Type: application/json")
    @POST(CREATE_END_POINT)
    suspend fun createPost(
        @Header("Authorization") token:String,
        @Body post: Post
    ): String

    @Headers("Content-Type: application/json")
    @GET(RETRIEVE_END_POINT)
    suspend fun retrievePost(
        @Header("Authorization") token:String,
    ): List<GetPost>






}