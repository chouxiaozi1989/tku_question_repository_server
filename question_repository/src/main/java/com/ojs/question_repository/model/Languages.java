package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Languages implements Serializable {


      private BigDecimal id;

    private String name;

      /**
     * 编译命令
     */
      private String compilecommand;

      /**
     * 运行命令/判题数据源名称
     */
      private String runcommand;


}
