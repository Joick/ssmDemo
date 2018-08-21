package com.simpledemo.dao;

import com.simpledemo.entity.TDictionaryItem;
import com.simpledemo.entity.TDictionaryItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hey
 */
public interface TDictionaryItemMapper {

    /**
     * 查询符合条件的个数
     *
     * @param example
     * @return
     */
    long countByExample(TDictionaryItemExample example);

    /**
     * 删除符合条件的数据
     *
     * @param example
     * @return
     */
    int deleteByExample(TDictionaryItemExample example);

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
    int insert(TDictionaryItem record);

    /**
     * 新增
     *
     * @param record
     * @return
     */
    int insertSelective(TDictionaryItem record);

    /**
     * 条件查询
     *
     * @param example
     * @return
     */
    List<TDictionaryItem> selectByExample(TDictionaryItemExample example);

    /**
     * 根据id查询实体
     *
     * @param id
     * @return
     */
    TDictionaryItem selectByPrimaryKey(Long id);

    /**
     * 更新数据
     *
     * @param record
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") TDictionaryItem record, @Param("example") TDictionaryItemExample example);

    /**
     * 更新数据
     *
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") TDictionaryItem record, @Param("example") TDictionaryItemExample example);

    /**
     * 更新数据,返回实体id
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(TDictionaryItem record);

    /**
     * 更新数据
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(TDictionaryItem record);
}