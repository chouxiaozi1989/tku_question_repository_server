package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 附件信息表
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Attachment implements Serializable {


      /**
     * 电子材料id
     */
      private BigDecimal atid;

      /**
     * 序号
     */
      private BigDecimal orderN;

      /**
     * base64
     */
      private String content;

      /**
     * 电子材料id
     */
      private String vpiid;


}
