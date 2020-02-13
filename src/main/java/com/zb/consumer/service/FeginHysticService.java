package com.zb.consumer.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FeginHysticService implements  FeignService {
    @Override
    public String shopping() {
        return "Sorry, 此路不通（当前服务不可用）";
    }

    @Override
    public List<Map> search() {
        System.out.println("没有search到数据");
        return null;
    }

    @Override
    public List<Map> findByName(Map map) {
        System.out.println("没有search到数据");
        return null;
    }
}
