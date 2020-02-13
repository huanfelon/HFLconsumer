package com.zb.consumer.controller;

import com.zb.consumer.service.ClientService;
import com.zb.consumer.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

//客户端类型，消费者类
@Controller
public class ClientController {

    @Autowired
    ClientService clientService;

    @Autowired
    FeignService feignService;

    @RequestMapping("/shopping")
    @ResponseBody
    public String shopping(){
        System.out.println("shopping");
        return feignService.shopping();
    }


    @RequestMapping("/search")
    public String search(Model model){
        model.addAttribute("users",feignService.search());
        System.out.println("SEARCH:"+feignService.search());
        return "list";
    }



    @RequestMapping("/findByName")
    public String findByName(Model model, @RequestParam()Map map){
        model.addAttribute("users",feignService.findByName(map));
        System.out.println("FINDBYNAME:"+feignService.findByName(map));
        System.out.println(map.get("userName"));
        return "list";
    }
}
