package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 试卷-试题基本信息表
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class PaperProblemsinfo implements Serializable {


      /**
     * pk
     */
        private BigDecimal id;

      /**
     * 问题id
     */
      private BigDecimal idProblem;

      /**
     * 题干id
     */
      private BigDecimal idPaperTopic;

      /**
     * 题型id
     */
      private BigDecimal idCat;

      /**
     * 试卷id
     */
      private BigDecimal idPaper;

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
     * 缺省分数
     */
      private BigDecimal defaultscore;

      /**
     * 题目顺序
     */
      private String problemSeq;

      /**
     * 原题干id
     */
      private BigDecimal idTopic;


}
