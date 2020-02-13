package com.zb.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

//表示是Feign客户端(设置访问值，与替代类),即当远端的服务不可用的时候，使用本地的类，但这个类必须实现本类
@FeignClient(value = "SERVICE-PROVIDER", fallback = FeginHysticService.class)
public interface FeignService {

    @RequestMapping("/buy")
    public String shopping();

    @RequestMapping("/search")
    public List<Map> search();


    @RequestMapping("/findByName")
    public List<Map> findByName(@RequestParam() Map map);
}
