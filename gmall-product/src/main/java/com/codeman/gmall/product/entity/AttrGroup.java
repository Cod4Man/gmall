package com.codeman.gmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 属性分组
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:15
 */
@Data
@TableName("pms_attr_group")
@ApiModel(value="AttrGroup对象", description="AttrGroup")
public class AttrGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 分组id
	 */
	@TableId
	@ApiModelProperty(value = "分组id")
	private Long attrGroupId;
	/**
	 * 组名
	 */
	@ApiModelProperty(value = "组名")
	private String attrGroupName;
	/**
	 * 排序
	 */
	@ApiModelProperty(value = "排序")
	private Integer sort;
	/**
	 * 描述
	 */
	@ApiModelProperty(value = "描述")
	private String descript;
	/**
	 * 组图标
	 */
	@ApiModelProperty(value = "组图标")
	private String icon;
	/**
	 * 所属分类id
	 */
	@ApiModelProperty(value = "所属分类id")
	private Long catelogId;

}
