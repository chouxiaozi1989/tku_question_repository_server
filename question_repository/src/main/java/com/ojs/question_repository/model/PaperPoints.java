package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 试卷-覆盖知识点
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class PaperPoints implements Serializable {


      /**
     * 试卷id
     */
      private BigDecimal idPaper;

      /**
     * 知识点id
     */
      private BigDecimal idKnopoint;


}
