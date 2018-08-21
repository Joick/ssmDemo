package com.simpledemo.dao;

import com.simpledemo.entity.TPostRepay;
import com.simpledemo.entity.TPostRepayExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hey
 */
public interface TPostRepayMapper {

    /**
     * 查询符合条件的个数
     *
     * @param example
     * @return
     */
    long countByExample(TPostRepayExample example);

    /**
     * 删除符合条件的数据
     *
     * @param example
     * @return
     */
    int deleteByExample(TPostRepayExample example);

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
    int insert(TPostRepay record);

    /**
     * 新增
     *
     * @param record
     * @return
     */
    int insertSelective(TPostRepay record);

    /**
     * 条件查询
     *
     * @param example
     * @return
     */
    List<TPostRepay> selectByExampleWithBLOBs(TPostRepayExample example);

    /**
     * 条件查询
     *
     * @param example
     * @return
     */
    List<TPostRepay> selectByExample(TPostRepayExample example);

    /**
     * 根据id查询实体
     *
     * @param id
     * @return
     */
    TPostRepay selectByPrimaryKey(Long id);

    /**
     * 更新数据
     *
     * @param record
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") TPostRepay record, @Param("example") TPostRepayExample example);

    /**
     * 更新数据
     *
     * @param record
     * @param example
     * @return
     */
    int updateByExampleWithBLOBs(@Param("record") TPostRepay record, @Param("example") TPostRepayExample example);

    /**
     * 更新数据
     *
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") TPostRepay record, @Param("example") TPostRepayExample example);

    /**
     * 更新数据,返回实体id
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(TPostRepay record);

    /**
     * 更新数据
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeyWithBLOBs(TPostRepay record);

    /**
     * 更新数据
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(TPostRepay record);
}