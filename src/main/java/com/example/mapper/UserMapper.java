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

     /**
     * @Author : 凌勇.
     * @Description :
     * @Params  :
     * @ReturnType :
     * @Date : 11:04, 2018/1/10
     */
     User getUser(Map<Object,Object> map);

}
