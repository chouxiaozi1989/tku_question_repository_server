package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 试卷基本信息
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Paperinfo implements Serializable {


      private BigDecimal id;

      /**
     * 名称
     */
      private String summary;

      /**
     * 描述
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
     * 总分数
     */
      private BigDecimal totalscore;

      /**
     * 是否审核
     */
      private String isverified;

      /**
     * 开始组卷时间
     */
      private LocalDateTime startmaketime;

      /**
     * 完成组卷时间
     */
      private LocalDateTime finishmaketime;

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

      /**
     * 所属机构
     */
      private String deptid;


}
