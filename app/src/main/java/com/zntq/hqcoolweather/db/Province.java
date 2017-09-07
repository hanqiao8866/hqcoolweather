package com.zntq.hqcoolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 记录省
 * Created by XieTao on 2017/9/7.
 */

// LitePal中的每一个实体类都必须继承自DataSupport类
public class Province extends DataSupport {

    private int id;

    private String provinceName;

    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
