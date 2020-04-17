package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 试卷-题干信息表
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class PaperTopicinfo implements Serializable {


      private BigDecimal id;

      /**
     * 题干id
     */
      private BigDecimal idTopic;

      /**
     * 大纲id
     */
      private BigDecimal idOutline;

      /**
     * 题目要求
     */
      private String summary;

    private String description;

      /**
     * 包含问题数
     */
      private BigDecimal pcount;

      /**
     * 电子材料id
     */
      private String vpiid;

    private String qtype;

    private BigDecimal idPaper;


}
