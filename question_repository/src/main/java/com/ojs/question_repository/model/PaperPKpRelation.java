package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 知识点-试卷试题关系表
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class PaperPKpRelation implements Serializable {


      /**
     * 试卷试题id
     */
      private BigDecimal idPaperProblem;

      /**
     * 知识点id
     */
      private BigDecimal idKnopoint;


}
