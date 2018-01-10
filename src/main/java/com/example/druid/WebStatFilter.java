package com.example.druid;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @Author :凌勇.
 * @Date: Created  on 14:53 2018/1/8.
 */
// druid过滤器.

@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*",
        initParams = {
                // 忽略资源
                @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")
        }
)

public class WebStatFilter extends com.alibaba.druid.support.http.WebStatFilter{}
