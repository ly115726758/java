package com.example.mapper;

import com.example.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by Administrator on 2018/1/2.
 */
@Component

public interface UserMapper {


     User getUser(Map<Object,Object> map);

}
