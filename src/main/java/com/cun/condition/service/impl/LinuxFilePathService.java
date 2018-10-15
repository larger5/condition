package com.cun.condition.service.impl;

import com.cun.condition.service.FilePathService;

public class LinuxFilePathService implements FilePathService {

    @Override
    public String showFilePath() {

        return "/home/file";
    }

}