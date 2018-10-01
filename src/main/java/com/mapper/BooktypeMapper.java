package com.mapper;

import com.po.Booktype;
import com.po.BooktypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooktypeMapper {
    long countByExample(BooktypeExample example);

    int deleteByExample(BooktypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Booktype record);

    int insertSelective(Booktype record);

    List<Booktype> selectByExample(BooktypeExample example);

    Booktype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Booktype record, @Param("example") BooktypeExample example);

    int updateByExample(@Param("record") Booktype record, @Param("example") BooktypeExample example);

    int updateByPrimaryKeySelective(Booktype record);

    int updateByPrimaryKey(Booktype record);
}