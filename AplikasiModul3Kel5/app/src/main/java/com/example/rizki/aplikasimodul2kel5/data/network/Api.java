package com.example.rizki.aplikasimodul2kel5.data.network;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Api {

    @Headers("Content-Type: application/json")

    @GET("getAllCar.php")
    Call<JsonObject> getAllCar();

    @GET("getCarById.php")
    Call<JsonObject> GetCarById(
            @Query("id") int id
    );

    @FormUrlEncoded
    @POST("addCar.php")
    Call<JsonObject> addCar(
            @Field("name") String name,
            @Field("merk") String merk,
            @Field("model") String model,
            @Field("year") String year
    );
    @FormUrlEncoded
    @POST("putCar.php")
    Call<JsonObject> putCar(
            @Field("name") String name, //field masuknya ke dalam file phpnya, bukan url php nya
            @Field("merk") String merk,
            @Field("model") String model,
            @Field("year") String year
    );
}
