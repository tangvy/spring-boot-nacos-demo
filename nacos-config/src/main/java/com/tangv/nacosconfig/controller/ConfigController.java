package com.tangv.nacosconfig.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:   tangwei
 * Date:     2020/12/15 14:04
 * Description:
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

    @NacosValue(value = "${userLocalCache:false}",autoRefreshed = true)
    private boolean useLocalCache;

    @GetMapping("/get")
    public boolean get(){
        return useLocalCache;
    }

}