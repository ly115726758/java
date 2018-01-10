package com.example.service;

import com.example.bean.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 *
 * @author Administrator
 * @date 2018/1/2
 */

public interface UserService {


    User getUser(Map<Object,Object> map);


}
