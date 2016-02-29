package com.angus.topdemo.utils;

import com.angus.topdemo.entities.ResponseEntity;
import com.angus.topdemo.entities.Top;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2016/2/27.
 */
public class NetworkUtil {
    public interface Service{
        @GET("/api/top/list")
        Call<ResponseEntity<Top>> getTopList(@Query("id")long id, @Query("page")int page, @Query("rows")int rows);
    }
    private static Service service;
    static {
        Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new TypeAdapter<Date>() {
            @Override
            public void write(JsonWriter out, Date value) throws IOException {
                out.value(value.getTime());
            }

            @Override
            public Date read(JsonReader in) throws IOException {
                long l = in.nextLong();
                return new Date(l);
            }
        }).create();
        service = new Retrofit.Builder()
                .baseUrl("http://www.tngou.net")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
                .create(Service.class);
    }

    public static Service getService() {
        return service;
    }
}
