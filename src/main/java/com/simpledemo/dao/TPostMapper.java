package com.simpledemo.dao;

import com.simpledemo.entity.TPost;
import com.simpledemo.entity.TPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPostMapper {
    long countByExample(TPostExample example);

    int deleteByExample(TPostExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TPost record);

    int insertSelective(TPost record);

    List<TPost> selectByExample(TPostExample example);

    TPost selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TPost record, @Param("example") TPostExample example);

    int updateByExample(@Param("record") TPost record, @Param("example") TPostExample example);

    int updateByPrimaryKeySelective(TPost record);

    int updateByPrimaryKey(TPost record);
}