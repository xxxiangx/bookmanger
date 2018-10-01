package com.mapper;

import com.po.Borrowbook;
import com.po.BorrowbookExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BorrowbookMapper {
    long countByExample(BorrowbookExample example);

    int deleteByExample(BorrowbookExample example);

    int deleteByPrimaryKey(Integer readerId);

    int insert(Borrowbook record);

    int insertSelective(Borrowbook record);

    List<Borrowbook> selectByExample(BorrowbookExample example);

    Borrowbook selectByPrimaryKey(Integer readerId);

    int updateByExampleSelective(@Param("record") Borrowbook record, @Param("example") BorrowbookExample example);

    int updateByExample(@Param("record") Borrowbook record, @Param("example") BorrowbookExample example);

    int updateByPrimaryKeySelective(Borrowbook record);

    int updateByPrimaryKey(Borrowbook record);
}