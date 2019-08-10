package com.shanmu2020.test.starter.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "auto")
public class AutoProperties {

    private String name = "jack";

    private String sex = "女";

    private String addr = "北京";
}
