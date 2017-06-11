package com.mo.test.mapper;

import com.mo.test.model.OrderDistribute;

public interface OrderDistributeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderDistribute record);

    int insertSelective(OrderDistribute record);

    OrderDistribute selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderDistribute record);

    int updateByPrimaryKey(OrderDistribute record);
}