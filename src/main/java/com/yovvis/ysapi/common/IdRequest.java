package com.yovvis.ysapi.common;

import java.io.Serializable;

import lombok.Data;

/**
 * 根据id操作请求
 *
 */
@Data
public class IdRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
