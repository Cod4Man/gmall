package com.codeman.gmall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 积分变化历史记录
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:49:01
 */
@Data
@TableName("ums_integration_change_history")
@ApiModel(value="IntegrationChangeHistory对象", description="IntegrationChangeHistory")
public class IntegrationChangeHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(value = "id")
	private Long id;
	/**
	 * member_id
	 */
	@ApiModelProperty(value = "member_id")
	private Long memberId;
	/**
	 * create_time
	 */
	@ApiModelProperty(value = "create_time")
	private Date createTime;
	/**
	 * 变化的值
	 */
	@ApiModelProperty(value = "变化的值")
	private Integer changeCount;
	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注")
	private String note;
	/**
	 * 来源[0->购物；1->管理员修改;2->活动]
	 */
	@ApiModelProperty(value = "来源[0->购物；1->管理员修改;2->活动]")
	private Integer sourceTyoe;

}
