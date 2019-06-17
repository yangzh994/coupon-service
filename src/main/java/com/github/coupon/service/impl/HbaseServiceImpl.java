package com.github.coupon.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.coupon.service.HbaseService;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.hadoop.hbase.HbaseTemplate;
import org.springframework.data.hadoop.hbase.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HbaseServiceImpl implements HbaseService {

    @Autowired
    private HbaseTemplate hbaseTemplate;
    @Override
    public String getValue(String tableName, String rowkey, String family, String column) {
        String result = hbaseTemplate.get(tableName, rowkey, family, column, new RowMapper<String>(){

            @Override
            public String mapRow(Result result, int i) throws Exception {
                List<Cell> cells = result.listCells();
                String rs = null;
                for (Cell cell : cells) {
                    rs = Bytes.toString(cell.getValueArray(),cell.getValueOffset(),cell.getValueLength());
                }
                return rs;
            }
        });
        return result;
    }

    @Override
    public void putValue(String tableName, String rowkey, String family, String column, String value) {
        hbaseTemplate.put(tableName,rowkey,family,column,value.getBytes());
    }

    @Override
    public void putJSONObject(String tableName, String rowkey, String family, JSONObject jsonObject) {

    }

    @Override
    public JSONObject getJSONObject(String tableName, String rowkey, String family) {
        return null;
    }


}
