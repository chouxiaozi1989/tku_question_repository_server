package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 试卷-试题附加信息表
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class PaperProblemsattach implements Serializable {


      /**
     * 试题id
     */
      private BigDecimal idPaperProblem;

      /**
     * 耗时限制
     */
      private BigDecimal timeLimit;

      /**
     * 内存限制
     */
      private BigDecimal memoryLimit;

      /**
     * 电子材料id
     */
      private String vpiid;

      /**
     * 试题输入格式描述
     */
      private String inputformat;

      /**
     * 试题输出描述
     */
      private String outputformat;

      /**
     * 试题样例输入
     */
      private String sampleinput;

      /**
     * 试题样例输出
     */
      private String sampleoutput;

      /**
     * 试题提示
     */
      private String hint;


}
