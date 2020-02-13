package com.zb.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClientService {

    @Autowired
    RestTemplate restTemplate;

    //购买服务（根据名字调用远端服务）
    public  String buyService(){
        return restTemplate.getForObject("http://SERVICE-PROVIDER/buy",String.class);
    }

}
