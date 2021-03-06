package com.codeman.gmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 秒杀活动商品关联
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:33
 */
@Data
@TableName("sms_seckill_sku_relation")
@ApiModel(value="SeckillSkuRelation对象", description="SeckillSkuRelation")
public class SeckillSkuRelation implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(value = "id")
	private Long id;
	/**
	 * 活动id
	 */
	@ApiModelProperty(value = "活动id")
	private Long promotionId;
	/**
	 * 活动场次id
	 */
	@ApiModelProperty(value = "活动场次id")
	private Long promotionSessionId;
	/**
	 * 商品id
	 */
	@ApiModelProperty(value = "商品id")
	private Long skuId;
	/**
	 * 秒杀价格
	 */
	@ApiModelProperty(value = "秒杀价格")
	private BigDecimal seckillPrice;
	/**
	 * 秒杀总量
	 */
	@ApiModelProperty(value = "秒杀总量")
	private Integer seckillCount;
	/**
	 * 每人限购数量
	 */
	@ApiModelProperty(value = "每人限购数量")
	private Integer seckillLimit;
	/**
	 * 排序
	 */
	@ApiModelProperty(value = "排序")
	private Integer seckillSort;

}
