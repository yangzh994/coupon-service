package com.github.coupon.config;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.hadoop.hbase.HbaseTemplate;

import java.util.Map;
import java.util.Set;

@Configuration
@EnableConfigurationProperties(HbaseProperties.class)
public class HbaseConfig {

    private HbaseProperties hbaseProperties;

    public HbaseConfig(HbaseProperties hbaseProperties){
        this.hbaseProperties = hbaseProperties;
    }

    @Bean
   public HbaseTemplate hbaseTemplate(){
        HbaseTemplate hbaseTemplate = new HbaseTemplate() ;
        Map<String, String> config = hbaseProperties.getConfig();
        Set<String> keySet = config.keySet();
        org.apache.hadoop.conf.Configuration configuration = HBaseConfiguration.create();
        for (String key : keySet) {
            configuration.set(key,config.get(key));
        }
        hbaseTemplate.setConfiguration(configuration);
        hbaseTemplate.setAutoFlush(true);
        return hbaseTemplate;
   }
}
