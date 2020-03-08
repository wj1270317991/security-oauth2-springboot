package com.wj.security.oauth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

/**
 * com.wj.security.oauth2.config
 * Created on 2020-03-04  22:21
 *
 * @author wangjun
 */
@Configuration
public class TokenConfig {

    @Bean
    public TokenStore tokenStore(){
        return new InMemoryTokenStore();
    }
}
