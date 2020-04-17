package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 试卷-题解信息
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class PaperSolutions implements Serializable {


      private BigDecimal id;

      /**
     * 试题id
     */
      private BigDecimal idPaperProblem;

      /**
     * 题解描述
     */
      private String description;

      /**
     * 答案是否有序
     */
      private String sequential;

    private String defaultsolution;


}
