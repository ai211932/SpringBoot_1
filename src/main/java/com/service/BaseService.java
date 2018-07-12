package com.service;

import java.io.Serializable;
import java.util.List;

/**
 * author JimmyBlue
 * date 2018/7/11 0003 10:25
 */

public interface BaseService<T, PK extends Serializable> {

    /**
     * 新增
     * @param t 实体
     * @return 主键
     */
    PK add(T t);

    /**
     * 根据ID删除
     * @param id id
     */
    void delete(Integer id);

    /**
     * 根据实体删除
     * @param t 待删除实体
     */
    void delete(T t);

    /**
     * 更新实体
     * @param t 实体
     */
    void update(T t);

    /**
     * 根据ID查找
     * @param id 等待查找的ID
     * @return 查找结果
     */
    T findOne(Integer id);

    /**
     * 查找所有
     * @return 查找结果
     */
    List<T> listAll();
}
