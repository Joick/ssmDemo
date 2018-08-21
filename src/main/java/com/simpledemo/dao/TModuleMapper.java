package com.simpledemo.dao;

import com.simpledemo.entity.TModule;
import com.simpledemo.entity.TModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TModuleMapper {
    long countByExample(TModuleExample example);

    int deleteByExample(TModuleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TModule record);

    int insertSelective(TModule record);

    List<TModule> selectByExample(TModuleExample example);

    TModule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TModule record, @Param("example") TModuleExample example);

    int updateByExample(@Param("record") TModule record, @Param("example") TModuleExample example);

    int updateByPrimaryKeySelective(TModule record);

    int updateByPrimaryKey(TModule record);
}