package com.ssm.service;

import org.springframework.stereotype.Service;

/**
 * Created by beiwei on 2017/5/17.
 */
@Service
public interface UserService {

    /**
     * 根据ID查找用户
     */
    int findeUserById(int id);


    /**
     * 根据id删除用户
     */
    int delete(int id);
}
