package com.ojs.question_repository.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 题型信息表
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Problemcategories implements Serializable {


      private BigDecimal id;

      /**
     * 是否客观题
     */
      private String isobjective;

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
     * 名称
     */
      private String summary;

      /**
     * 编辑页面所用组件名
     */
      private String component;

      /**
     * 考试页面所用组件名
     */
      private String examcomponent;

      /**
     * 默认试题类型
     */
      private String qtype;


}
