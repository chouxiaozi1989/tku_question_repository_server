package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 判题提交记录
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Submissions implements Serializable {


      private BigDecimal submissionId;

      /**
     * 试题id
     */
      private BigDecimal problemId;

      /**
     * 语言id
     */
      private BigDecimal languageId;

      /**
     * 人员id
     */
      private String empid;

      /**
     * 提交时间
     */
      private LocalDateTime submissionSubmitTime;

      /**
     * 执行时间
     */
      private LocalDateTime submissionExecuteTime;

      /**
     * 完成时间
     */
      private LocalDateTime submissionEndTime;

      /**
     * 执行内存消耗
     */
      private BigDecimal submissionUsedMemory;

      /**
     * 执行结果
     */
      private String submissionJudgeResult;

      /**
     * 分数
     */
      private BigDecimal submissionJudgeScore;

    private String submissionCode;

    private String submissionJudgeLog;


}
