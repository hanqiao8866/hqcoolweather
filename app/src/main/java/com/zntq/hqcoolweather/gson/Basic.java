package com.zntq.hqcoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Basic类
 * Created by XieTao on 2017/9/7.
 */

public class Basic {

    // JSON中的一些字段可能不太适合作为Java字段来命名，这里使用了@SerializedName注解的方式来让JSON字段和Java字段之间建立映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
