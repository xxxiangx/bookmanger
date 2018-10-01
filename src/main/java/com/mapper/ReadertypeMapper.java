package com.mapper;

import com.po.Readertype;
import com.po.ReadertypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReadertypeMapper {
    long countByExample(ReadertypeExample example);

    int deleteByExample(ReadertypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Readertype record);

    int insertSelective(Readertype record);

    List<Readertype> selectByExample(ReadertypeExample example);

    Readertype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Readertype record, @Param("example") ReadertypeExample example);

    int updateByExample(@Param("record") Readertype record, @Param("example") ReadertypeExample example);

    int updateByPrimaryKeySelective(Readertype record);

    int updateByPrimaryKey(Readertype record);
}