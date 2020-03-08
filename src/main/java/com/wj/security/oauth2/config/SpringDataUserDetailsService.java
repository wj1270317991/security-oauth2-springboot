package com.wj.security.oauth2.config;

import com.alibaba.fastjson.JSON;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 **/
@Service
public class SpringDataUserDetailsService implements UserDetailsService {



    //根据 账号查询用户信息
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails userDetails = User.withUsername("zhangSan").password("$2a$10$tpkKom/AuoYid8ouuBOHIOVPN0VkisC0VHuO2HH7H2B0UHr7xrmjq").authorities("dddd").build();
        return userDetails;
    }
}
