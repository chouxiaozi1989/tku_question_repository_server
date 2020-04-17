package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 组卷任务
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Papermakemission implements Serializable {


      private BigDecimal id;

      /**
     * 开始组卷时间
     */
      private LocalDateTime startmaketime;

      /**
     * 完成组卷时间
     */
      private LocalDateTime finishmaketime;

      /**
     * 状态
     */
      private String status;

    private BigDecimal idPaper;

    private BigDecimal idStrategy;

    private String creator;

    private String errmsg;


}
