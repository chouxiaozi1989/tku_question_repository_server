package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 组卷策略-覆盖知识点配置
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class PaperstrategyPoints implements Serializable {


      /**
     * 策略id
     */
      private BigDecimal idStrategy;

      /**
     * 知识点id
     */
      private BigDecimal idKnopoint;

      /**
     * 权重
     */
      private BigDecimal weight;


}
