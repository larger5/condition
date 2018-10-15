package com.cun.condition.config;

import com.cun.condition.service.FilePathService;
import com.cun.condition.service.impl.LinuxFilePathService;
import com.cun.condition.service.impl.WindowsFilePathService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.cun.condition")
public class FilePathConditionConfig {

    @Bean
    @Conditional(LinuxCondition.class)// 使用@Conditional注解，符合Linux条件就实例化LinuxListService
    public FilePathService linuxListService() {
        return new LinuxFilePathService();
    }

    @Bean
    @Conditional(WindowsCondition.class)// 使用@Conditional注解，符合Windows条件就实例化WindowsListService
    public FilePathService windowsListService() {
        return new WindowsFilePathService();
    }

}
