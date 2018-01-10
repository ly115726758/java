package com.example.adepter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author :凌勇.
 * @Date: Created  on 10:43 2018/1/5.
 */
public class SessionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String uri=  httpServletRequest.getRequestURI();
        System.out.println("uri:"+uri);
        System.out.println("真的 吗："+uri.endsWith("index"));
        HttpSession session=httpServletRequest.getSession();
       // System.out.println("session是否为空:"+session.getAttribute("user")!=null);
        /*System.out.println("session:"+session.getAttribute("user"));
        if (uri.endsWith("index")||session.getAttribute("user")!=null){
            return true;
        }else {
            System.out.println("我来了");
            httpServletResponse.sendRedirect("/userController/index");
            return true;

        }
*/
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {


    }
}
