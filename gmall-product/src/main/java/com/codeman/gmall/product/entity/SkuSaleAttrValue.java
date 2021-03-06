package com.codeman.gmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sku销售属性&值
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:13
 */
@Data
@TableName("pms_sku_sale_attr_value")
@ApiModel(value="SkuSaleAttrValue对象", description="SkuSaleAttrValue")
public class SkuSaleAttrValue implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(value = "id")
	private Long id;
	/**
	 * sku_id
	 */
	@ApiModelProperty(value = "sku_id")
	private Long skuId;
	/**
	 * attr_id
	 */
	@ApiModelProperty(value = "attr_id")
	private Long attrId;
	/**
	 * 销售属性名
	 */
	@ApiModelProperty(value = "销售属性名")
	private String attrName;
	/**
	 * 销售属性值
	 */
	@ApiModelProperty(value = "销售属性值")
	private String attrValue;
	/**
	 * 顺序
	 */
	@ApiModelProperty(value = "顺序")
	private Integer attrSort;

}
