package com.boot1.starter.redission;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @despcription 配置的属性
 * @Authror wjm
 * @Date 2020/6/30 15:08
 **/
@ConfigurationProperties(prefix = "test1.redisson")
public class RedissionProperties {

    private String host;

    private String passwd;

    private Integer port;



    private boolean ifSsl = false;


    public boolean getIfSsl() {
        return ifSsl;
    }

    public void setIfSsl(boolean ifSsl) {
        this.ifSsl = ifSsl;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }


}
