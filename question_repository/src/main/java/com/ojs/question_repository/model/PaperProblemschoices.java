package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 试卷-试题选项表
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class PaperProblemschoices implements Serializable {


      private BigDecimal cid;

      /**
     * 选项内容
     */
      private String content;

      /**
     * 试题id
     */
      private BigDecimal idPaperProblem;

      /**
     * 电子材料id
     */
      private String vpiid;


}
