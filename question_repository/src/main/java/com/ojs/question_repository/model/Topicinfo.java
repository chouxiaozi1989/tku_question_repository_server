package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 题干信息表
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Topicinfo implements Serializable {


      private BigDecimal id;

    private String description;

      /**
     * 电子材料id
     */
      private String vpiid;

      /**
     * 创建人
     */
      private String creator;

      /**
     * 创建日期
     */
      private LocalDateTime creationdate;

      /**
     * 修改人
     */
      private String modifier;

      /**
     * 修改日期
     */
      private LocalDateTime modifieddate;

      /**
     * 是否有效
     */
      private String isvalid;

      /**
     * 大纲id
     */
      private BigDecimal idOutline;

      /**
     * 题目要求
     */
      private String summary;

      /**
     * 包含问题数
     */
      private BigDecimal pcount;

      /**
     * 试题类型-SYSTEMCODE
     */
      private String qtype;

      /**
     * 是否审核
     */
      private String isverified;

      /**
     * 审核意见
     */
      private String verifyOpinion;

      /**
     * 审核人
     */
      private String verifier;

      /**
     * 审核日期
     */
      private LocalDateTime verifieddate;


}
