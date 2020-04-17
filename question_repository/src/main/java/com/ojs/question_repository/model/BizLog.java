package com.ojs.question_repository.model;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 日志记录表
 * </p>
 *
 * @author CaiYi
 * @since 2020-04-16
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class BizLog implements Serializable {


      /**
     * 用户id
     */
      private String userid;

      /**
     * 操作类型
     */
      private String czlx;

      /**
     * 数据信息
     */
      private String data;

      /**
     * 经办时间
     */
      private LocalDateTime jbsj;

      /**
     * 备注
     */
      private String bz;


}
