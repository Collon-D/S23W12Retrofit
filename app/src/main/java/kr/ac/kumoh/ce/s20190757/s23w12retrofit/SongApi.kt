package kr.ac.kumoh.ce.s20190757.s23w12retrofit

import retrofit2.http.GET

interface SongApi {
    @GET("song")
    suspend fun getSongs(): List<Song>      // suspend는 함수가 실행될 때 일시 중단
}