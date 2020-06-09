package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    //json中有些字段不太适合用java字段命名，因此使用了SerializedName注解的方式，让json与java字段间建立联系
    @SerializedName("city")
    public String cityName;

    //城市对应的天气
    @SerializedName("id")
    public String weatherId;

    public Update update;


    //更新时间
    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
