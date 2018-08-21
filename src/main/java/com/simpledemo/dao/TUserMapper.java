package com.simpledemo.dao;

import com.simpledemo.entity.TUser;
import com.simpledemo.entity.TUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hey
 */
public interface TUserMapper {

    /**
     * 查询符合条件的个数
     *
     * @param example
     * @return
     */
    long countByExample(TUserExample example);

    /**
     * 删除符合条件的数据
     *
     * @param example
     * @return
     */
    int deleteByExample(TUserExample example);

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 新增
     *
     * @param record
     * @return
     */
    int insert(TUser record);

    /**
     * 新增
     *
     * @param record
     * @return
     */
    int insertSelective(TUser record);

    /**
     * 条件查询
     *
     * @param example
     * @return
     */
    List<TUser> selectByExample(TUserExample example);

    /**
     * 根据id查询实体
     *
     * @param id
     * @return
     */
    TUser selectByPrimaryKey(Long id);

    /**
     * 更新数据
     *
     * @param record
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    /**
     * 更新数据
     *
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

    /**
     * 更新数据,返回实体id
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(TUser record);

    /**
     * 更新数据
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(TUser record);
}