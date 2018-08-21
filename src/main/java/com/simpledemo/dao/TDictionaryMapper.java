package com.simpledemo.dao;

import com.simpledemo.entity.TDictionary;
import com.simpledemo.entity.TDictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDictionaryMapper {
    long countByExample(TDictionaryExample example);

    int deleteByExample(TDictionaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TDictionary record);

    int insertSelective(TDictionary record);

    List<TDictionary> selectByExample(TDictionaryExample example);

    TDictionary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TDictionary record, @Param("example") TDictionaryExample example);

    int updateByExample(@Param("record") TDictionary record, @Param("example") TDictionaryExample example);

    int updateByPrimaryKeySelective(TDictionary record);

    int updateByPrimaryKey(TDictionary record);
}