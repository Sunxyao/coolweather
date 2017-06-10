package com.example.lovesun.firstcode_coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Love—Sun on 2017/5/31.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
