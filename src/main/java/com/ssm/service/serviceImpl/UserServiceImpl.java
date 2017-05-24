package com.ssm.service.serviceImpl;

import com.ssm.dao.UserDao;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by beiwei on 2017/5/17.
 */

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    public int findeUserById(int id) {
        return userDao.findUserById(id);
    }

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    public int delete(int id){
        return userDao.delete(id);
    }
}
