package com.zntq.hqcoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by XieTao on 2017/9/7.
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
