package com.cun.condition.controller;

import com.cun.condition.service.FilePathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyController {

    @Autowired
    private FilePathService filePathService;

    @RequestMapping("/get")
    public String getFilPath(){
        return filePathService.showFilePath();
    }

}
