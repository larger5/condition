package com.cun.condition.service.impl;


import com.cun.condition.service.FilePathService;

public class WindowsFilePathService implements FilePathService {

    @Override
    public String showFilePath() {

        return "C://file";
    }

}
