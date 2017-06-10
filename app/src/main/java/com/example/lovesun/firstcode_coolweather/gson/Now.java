package com.example.lovesun.firstcode_coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Love—Sun on 2017/6/2.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
