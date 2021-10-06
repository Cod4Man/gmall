package com.codeman.gmall.order.mapper;

import com.codeman.gmall.order.entity.OrderItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 11:18:11
 */
@Mapper
public interface OrderItemMapper extends BaseMapper<OrderItem> {
	
}
