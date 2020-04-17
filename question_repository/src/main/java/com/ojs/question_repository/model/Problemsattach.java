package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 试题附加信息表
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Problemsattach implements Serializable {


      /**
     * 试题id
     */
      private BigDecimal idProblem;

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
     * 创建人
     */
      private String creator;

      /**
     * 创建日期
     */
      private LocalDateTime creationdate;

      /**
     * 修改人
     */
      private String modifier;

      /**
     * 修改日期
     */
      private LocalDateTime modifieddate;

      /**
     * 是否有效
     */
      private String isvalid;

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
