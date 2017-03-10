package com.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Super on 2017/3/10.
 */
@RestController
public class ConsumerController {

    @Autowired
    ComputeClient client;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public Integer add(){
        return client.add(10,20);
    }

}
