package com.example.aspect;

import com.example.bean.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author :lingyong.
 * @Date: Created  on 10:52 2018/1/4.
 */

@Aspect
@Component
public class MyAspect {

    @Before("eexecutionservice()")
    /**
    * @Author : 凌勇.
    * @Description : before 
    * @Params  :  [joinPoint]
    * @ReturnType :  void
    * @Date : 17:58, 2018/1/4
    */
    public void before(JoinPoint joinPoint) {
        System.out.println("前置通知");
        //获取传入参数返回一个obj数组
        Object[]  obj=joinPoint.getArgs();
        Map<Object,Object> map=null;
        for (Object o : obj) {
           map= (Map<Object, Object>) o;
        }
        System.out.println("名字"+map.get("username"));




        System.out.println("方法参数数组长度"+obj.length);
        System.out.println("方法名"+joinPoint.getSignature().getName());


    }
  @AfterReturning(value = "eexecutionservice()",returning = "keys")
  /**
  * @Author : 凌勇.
  * @Description : after 
  * @Params  :  [j, keys]
  * @ReturnType :  void
  * @Date : 17:58, 2018/1/4
  */
    public void after(JoinPoint j , Object keys){

      User user= (User) keys;
      System.out.println("返回名字："+user.getU_name());

    }
  @AfterThrowing(value = "eexecutionservice()",throwing = "exception")
    public void afterthrong(JoinPoint j , Exception exception){

      System.out.println("异常"+exception);
    }

    /**
    * @Author : 凌勇.
    * @Description : aroundAdvice 
    * @Params  :  [proceedingJoinPoint]
    * @ReturnType :  java.lang.Object
    * @Date : 15:38, 2018/1/8
    */
    @Around("eexecutionservice()")
    public  Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object obj=null;
        System.out.println("环绕方法名："+proceedingJoinPoint.getSignature().getName());
        if ("getUser".equals(proceedingJoinPoint.getSignature().getName())){
         obj=proceedingJoinPoint.proceed();
            System.out.println("我出来了");
        }
     return  obj;
    }



    @Pointcut("execution(* com.example.service.*.*(..))")
    public void eexecutionservice() {
    }

}
