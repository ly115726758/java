package com.example.service;

import com.example.bean.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Administrator on 2018/1/2.
 */
@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    UserMapper um;

    @Override
    /**
    * @Author : 凌勇.
    * @Description : getUser 
    * @Params  :  [map]
    * @ReturnType :  com.example.bean.User
    * @Date : 17:59, 2018/1/4
    */
    public User getUser(Map<Object,Object> map) {
       /*int i=10/0;*/
        return um.getUser( map);
    }


}
