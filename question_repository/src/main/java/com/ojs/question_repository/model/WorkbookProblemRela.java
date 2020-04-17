package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 试题集-试题关系表
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class WorkbookProblemRela implements Serializable {


      /**
     * 试题集id
     */
      private BigDecimal idWorkbook;

      /**
     * 试题id
     */
      private BigDecimal idProblem;


}
