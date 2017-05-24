package com.ssm.dao;


/**
 * Created by beiwei on 2017/5/17.
 */
public interface UserDao {

    /**
     * 根据ID查找用户
     * @param id
     * @return
     */
      int findUserById(int id);

    /**
     * 删除用户
     */
     int delete(int id);
}
