package com.codeman.gmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu属性值
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:13
 */
@Data
@TableName("pms_product_attr_value")
@ApiModel(value="ProductAttrValue对象", description="ProductAttrValue")
public class ProductAttrValue implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(value = "id")
	private Long id;
	/**
	 * 商品id
	 */
	@ApiModelProperty(value = "商品id")
	private Long spuId;
	/**
	 * 属性id
	 */
	@ApiModelProperty(value = "属性id")
	private Long attrId;
	/**
	 * 属性名
	 */
	@ApiModelProperty(value = "属性名")
	private String attrName;
	/**
	 * 属性值
	 */
	@ApiModelProperty(value = "属性值")
	private String attrValue;
	/**
	 * 顺序
	 */
	@ApiModelProperty(value = "顺序")
	private Integer attrSort;
	/**
	 * 快速展示【是否展示在介绍上；0-否 1-是】
	 */
	@ApiModelProperty(value = "快速展示【是否展示在介绍上；0-否 1-是】")
	private Integer quickShow;

}
