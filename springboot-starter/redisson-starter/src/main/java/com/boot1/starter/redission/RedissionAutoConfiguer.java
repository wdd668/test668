package com.boot1.starter.redission;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @despcription 自动装配
 * @Authror wjm
 * @Date 2020/6/30 15:08
 **/

@ConditionalOnClass(Redisson.class)
@EnableConfigurationProperties(RedissionProperties.class)
@Configuration
public class RedissionAutoConfiguer {


    @Bean
    RedissonClient redissonClient(RedissionProperties redissionProperties){
        System.out.println(redissionProperties);
        System.out.println(redissionProperties.getHost());
        Config config = new Config();
        String prefix="redis://";
        if(redissionProperties.getIfSsl()){
            prefix="rediss://";
        }
        System.out.println("----");
        config.useSingleServer().setAddress(prefix + redissionProperties.getHost() + ":" + redissionProperties.getPort())
                .setPassword(redissionProperties.getPasswd());
        System.out.println("-222---");
        return Redisson.create(config);
    }
}
