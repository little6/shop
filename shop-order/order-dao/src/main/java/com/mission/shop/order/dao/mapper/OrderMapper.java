package com.mission.shop.order.dao.mapper;

import com.mission.shop.order.dao.model.Order;
import com.mission.shop.order.dao.model.OrderExample;
import java.util.List;

import com.mission.shop.order.dao.model.QueryOrderPO;
import com.mission.shop.order.dao.model.QueryOrderRO;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_order
	 * @mbggenerated  Thu Nov 27 13:50:23 CST 2014
	 */
	int countByExample(OrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_order
	 * @mbggenerated  Thu Nov 27 13:50:23 CST 2014
	 */
	int deleteByExample(OrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_order
	 * @mbggenerated  Thu Nov 27 13:50:23 CST 2014
	 */
	int deleteByPrimaryKey(Long orderId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_order
	 * @mbggenerated  Thu Nov 27 13:50:23 CST 2014
	 */
	int insert(Order record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_order
	 * @mbggenerated  Thu Nov 27 13:50:23 CST 2014
	 */
	int insertSelective(Order record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_order
	 * @mbggenerated  Thu Nov 27 13:50:23 CST 2014
	 */
	List<Order> selectByExample(OrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_order
	 * @mbggenerated  Thu Nov 27 13:50:23 CST 2014
	 */
	Order selectByPrimaryKey(Long orderId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_order
	 * @mbggenerated  Thu Nov 27 13:50:23 CST 2014
	 */
	int updateByExampleSelective(@Param("record") Order record,
			@Param("example") OrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_order
	 * @mbggenerated  Thu Nov 27 13:50:24 CST 2014
	 */
	int updateByExample(@Param("record") Order record,
			@Param("example") OrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_order
	 * @mbggenerated  Thu Nov 27 13:50:24 CST 2014
	 */
	int updateByPrimaryKeySelective(Order record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_order
	 * @mbggenerated  Thu Nov 27 13:50:24 CST 2014
	 */
	int updateByPrimaryKey(Order record);

	List<QueryOrderRO> queryOrder(QueryOrderPO queryOrderPO);
	int countOrder(QueryOrderPO queryOrderPO);
}