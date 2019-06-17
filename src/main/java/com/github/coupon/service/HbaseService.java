package com.github.coupon.service;

import com.alibaba.fastjson.JSONObject;

public interface HbaseService {

    String getValue(String tableName,String rowkey,String family,String column);

    void putValue(String tableName,String rowkey,String family,String column,String value);

    void putJSONObject(String tableName,String rowkey,String family,JSONObject jsonObject);

    JSONObject getJSONObject(String tableName,String rowkey,String family);
}
