package com.example.adepter;

import jdk.internal.org.objectweb.asm.commons.AdviceAdapter;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author :凌勇.
 * @Date: Created  on 10:58 2018/1/5.
 */
@Component
public class AdepterConfiguration extends WebMvcConfigurerAdapter {

    @Override

    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new SessionInterceptor());
    }
}



