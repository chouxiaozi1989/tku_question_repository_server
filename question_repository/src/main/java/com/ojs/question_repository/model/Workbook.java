package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 试题集
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Workbook implements Serializable {


      /**
     * 编号
     */
        private BigDecimal id;

      /**
     * 摘要
     */
      private String summary;

      /**
     * 描述
     */
      private String description;

      /**
     * 创建人
     */
      private String creator;

      /**
     * 创建日期
     */
      private LocalDateTime creationdate;

      /**
     * 课程编号
     */
      private String courseid;

      /**
     * 用途(1练习,2考试)
     */
      private String use;

      /**
     * 所属机构
     */
      private String belongdept;

      /**
     * 修改人
     */
      private String modifier;

      /**
     * 修改日期
     */
      private LocalDateTime modifieddate;

      /**
     * 启用标志
     */
      private String isvalid;


}
