package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 试题基本信息表
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Problemsinfo implements Serializable {


      /**
     * pk
     */
        private BigDecimal id;

      /**
     * 题干id
     */
      private BigDecimal idTopic;

      /**
     * 题型id
     */
      private BigDecimal idCat;

      /**
     * 题目要求
     */
      private String summary;

      /**
     * 题目附加描述
     */
      private String description;

      /**
     * 难度
     */
      private BigDecimal difficult;

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
     * 缺省分数
     */
      private BigDecimal defaultscore;

      /**
     * 是否审核
     */
      private String isverified;

      /**
     * 审批人
     */
      private String verifier;

      /**
     * 审批日期
     */
      private LocalDateTime verifieddate;


}
