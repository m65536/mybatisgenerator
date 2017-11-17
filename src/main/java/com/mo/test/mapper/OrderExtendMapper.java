package com.mo.test.mapper;

import com.mo.test.model.OrderExtend;
import com.mo.test.model.OrderExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderExtendMapper {
    int countByExample(OrderExtendExample example);

    int deleteByExample(OrderExtendExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderExtend record);

    int insertSelective(OrderExtend record);

    List<OrderExtend> selectByExample(OrderExtendExample example);

    OrderExtend selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderExtend record, @Param("example") OrderExtendExample example);

    int updateByExample(@Param("record") OrderExtend record, @Param("example") OrderExtendExample example);

    int updateByPrimaryKeySelective(OrderExtend record);

    int updateByPrimaryKey(OrderExtend record);
}