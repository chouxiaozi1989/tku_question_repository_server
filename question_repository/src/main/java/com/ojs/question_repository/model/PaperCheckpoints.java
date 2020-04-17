package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 试卷-题解检查点
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class PaperCheckpoints implements Serializable {


      private BigDecimal id;

    private BigDecimal idPaperSolution;

    private BigDecimal idPaperProblem;

    private String input;

    private String output;


}
