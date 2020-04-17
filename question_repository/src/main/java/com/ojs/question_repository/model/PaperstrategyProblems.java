package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 组卷策略-试题配置
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class PaperstrategyProblems implements Serializable {


      /**
     * 策略id
     */
      private BigDecimal idStrategy;

      /**
     * 大题题型
     */
      private String qtype;

      /**
     * 包含问题数
     */
      private BigDecimal problemnums;

      /**
     * 大题显示顺序
     */
      private BigDecimal showorder;


}
